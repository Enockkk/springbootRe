package com.resume.management.system.design.dao;

import com.resume.management.system.design.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobsDao extends JpaRepository<Jobs, Integer> {

    List<Jobs> findAll();

}
