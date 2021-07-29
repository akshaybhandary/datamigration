package com.scotia.datamigrationkyc.domain.data.service;

import com.scotia.datamigrationkyc.domain.data.entity.Kyc;
import com.scotia.datamigrationkyc.domain.data.impl.KycRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KycService {
    public KycRepositoryImpl kycRepository;

    KycService(KycRepositoryImpl kycRepositoryImpl) {
        this.kycRepository = kycRepositoryImpl;
    }

    public List<Kyc> getAllData() {
        return this.kycRepository.findAll();
    }
}
