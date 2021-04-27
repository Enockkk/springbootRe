package com.resume.management.system.design.dao;

import com.resume.management.system.design.entity.Wi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface WiDao extends JpaRepository<Wi, Integer> {
    List<Wi> findAll();

    List<Wi> findByCompany(String company);//招聘者查看本公司投递人员名单

    List<Wi> findByWid(int wid);//招聘者查看本岗位投递人员名单

    List<Wi> findById(int id);//求职者查看本人已投递岗位名单

    @Modifying
    @Query(value = "select * from wi where id=(:id) and wid =(:wid);", nativeQuery = true)
    List<Wi> findByIdAndWid(@Param(value = "id") int id,@Param(value = "wid") int wid);
}
