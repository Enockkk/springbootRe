package com.resume.management.system.design.dao;

import com.resume.management.system.design.entity.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MasterDao extends JpaRepository<Master, Integer> {
    List<Master> findAll();
    void deleteById(int id);
    List<Master> findById(int id);


    @Transactional
    @Modifying
    @Query(value = "insert into master (id) values (:id)", nativeQuery = true)
    int addId(@Param(value = "id") int id);

}
