package com.scotia.datamigrationkyc.domain.data.repository;

import com.scotia.datamigrationkyc.domain.data.entity.Kyc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KycJpaRepository extends JpaRepository<Kyc, Long> {
    @Override
    public List<Kyc> findAll();
}
