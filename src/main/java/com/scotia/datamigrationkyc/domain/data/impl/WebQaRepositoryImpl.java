package com.scotia.datamigrationkyc.domain.data.impl;

import com.scotia.datamigrationkyc.domain.data.repository.WebQaJpaRepository;
import com.scotia.datamigrationkyc.domain.data.repository.WebQaRepository;
import com.scotia.datamigrationkyc.domain.data.entity.WebQa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WebQaRepositoryImpl extends WebQaRepository {
    WebQaJpaRepository webQaRepository;

    WebQaRepositoryImpl(WebQaJpaRepository webQaRepository) {
        this.webQaRepository = webQaRepository;
    }

    public List<WebQa> findAll() {
        return this.webQaRepository.findAll();
    }
    public List<WebQa> findByQa( String qaGroup,String qaKey,String tag) {
        return this.webQaRepository.findByQaGroupAndQaKeyAndTag(qaGroup, qaKey, tag);
    }
    public List<WebQa> findByQuestion( String qaGroup,String tag) {
        return this.webQaRepository.findByQaGroupAndTag(qaGroup, tag);
    }
}
