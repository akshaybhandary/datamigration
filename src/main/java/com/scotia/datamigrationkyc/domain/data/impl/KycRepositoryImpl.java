package com.scotia.datamigrationkyc.domain.data.impl;

import com.scotia.datamigrationkyc.domain.data.repository.KycJpaRepository;
import com.scotia.datamigrationkyc.domain.data.repository.KycRepository;
import com.scotia.datamigrationkyc.domain.data.entity.Kyc;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KycRepositoryImpl extends KycRepository{
    KycJpaRepository kycJpaRepository;
    KycRepositoryImpl(KycJpaRepository kycJpaRepository){
        this.kycJpaRepository = kycJpaRepository;
    }
    public List<Kyc> findAll(){
        return this.kycJpaRepository.findAll();
    }
}
