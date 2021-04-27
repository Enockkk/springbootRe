package com.resume.management.system.design.dao;

import com.resume.management.system.design.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
    public List<Admin> findByName(String name);
}
