package com.resume.management.system.design.dao;

import com.resume.management.system.design.entity.Infomation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface InfomationDao extends JpaRepository<Infomation, Integer> {
    List<Infomation> findAll();
    void deleteById(int id);
    List<Infomation> findById(int id);
    List<Infomation> findByWid(int wid);
    List<Infomation> findByEducation(String education);
    List<Infomation> findByGraduation(String graduation);
    List<Infomation> findByMajor(String major);
    //UPDATE user set rname = :rname where userid = 20
//    insert into infomation (id) values (7)
    @Transactional
    @Modifying
    @Query(value = "insert into infomation (id,wid) values (:id,-1)", nativeQuery = true)
    int addId(@Param(value = "id") int id);

//    void addResume(@Param(value = "id") int id);
}
