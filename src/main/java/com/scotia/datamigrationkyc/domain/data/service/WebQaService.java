package com.scotia.datamigrationkyc.domain.data.service;

import com.scotia.datamigrationkyc.domain.data.model.QaCode;
import com.scotia.datamigrationkyc.domain.data.model.Questions;
import com.scotia.datamigrationkyc.domain.data.model.QuestionsSets;
import com.scotia.datamigrationkyc.domain.data.entity.Kyc;
import com.scotia.datamigrationkyc.domain.data.entity.WebQa;
import com.scotia.datamigrationkyc.domain.data.impl.KycRepositoryImpl;
import com.scotia.datamigrationkyc.domain.data.impl.WebQaRepositoryImpl;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service

public class WebQaService {
    WebQaRepositoryImpl webQaRepository;
    Map<Long, Map<String, Object>> qaMap = new HashMap<>();
    KycRepositoryImpl kycRepositoryImpl;

    public WebQaService(WebQaRepositoryImpl webQaRepository, KycRepositoryImpl kycRepositoryImpl){
        this.webQaRepository = webQaRepository;
        this.kycRepositoryImpl = kycRepositoryImpl;
    }
    public List<QuestionsSets> getAllQa(){
        List<WebQa> webQaList=  this.webQaRepository.findAll();
        List<Kyc> kycList=  this.kycRepositoryImpl.findAll();

        WebQa qa =  new WebQa();
        for (Kyc kyc: kycList){
            long kycId = kyc.getKycId();
            Map<String, Object> kycMap = new HashMap<>();
            Field[] kycFields = kyc.getClass().getDeclaredFields();
            for(Field field:kycFields){
                field.setAccessible(true);
                try {
                    if(qaMap.containsKey(kycId)){
                        kycMap = qaMap.get(kycId);
                    }
                    kycMap.put(field.getName(), field.get(kyc));
                    qaMap.put(kycId, kycMap );

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        }
        return convertToJson(qaMap);
    }

    List<QuestionsSets> convertToJson(Map qaMap){
            List<QuestionsSets> questionsSetsList = new ArrayList<>();
            for(Object key : qaMap.keySet()){
                QuestionsSets questionsSets = new QuestionsSets();
                List<Questions> questionsList = new ArrayList<>();
                questionsSets.setQuestionList(questionsList);
                Map<String, Object> answerMap = (Map<String, Object>) qaMap.get(key);
                for(String answer:answerMap.keySet()){
                    Long answerString = (Long) answerMap.get(answer);
                    if(QaCode.grossAnnualIncome.getKey().equalsIgnoreCase(answer) || QaCode.timeHorizon.getKey().equalsIgnoreCase(answer)){
                        List<WebQa> webList = this.webQaRepository.findByQa(QaCode.valueOf(answer).getValue(), answerString.toString(), "A");
                        List<WebQa> questionList = this.webQaRepository.findByQuestion(QaCode.valueOf(answer).getValue(), "Q");
                        List<String> tags = new ArrayList<>();
                        tags.add("MADLIBS");
                        tags.add(answer);

                        Questions questions = new Questions();
                        questions.setText(questionList.get(0).getDescrEn());
                        questions.setAnswer(webList.get(0).getDescrEn());
                        questions.setTags(tags);
                        questionsSets.getQuestionList().add(questions);

                    }
                }
                questionsSetsList.add(questionsSets);
            }
            return questionsSetsList;
    }

}
