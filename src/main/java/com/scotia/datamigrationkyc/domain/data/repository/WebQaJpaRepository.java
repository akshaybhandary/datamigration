package com.scotia.datamigrationkyc.domain.data.repository;

import com.scotia.datamigrationkyc.domain.data.entity.WebQa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebQaJpaRepository extends JpaRepository<WebQa, Long> {
    @Override
    public List<WebQa> findAll();
    public List<WebQa> findByQaGroupAndQaKeyAndTag(String qaGroup, String qaKey, String tag);
    public List<WebQa> findByQaGroupAndTag(String qaGroup, String tag);

}
