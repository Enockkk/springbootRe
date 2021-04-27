package com.resume.management.system.design.controller;

import com.resume.management.system.design.dao.JobsDao;
import com.resume.management.system.design.entity.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class JobsController {

    @Autowired
    private JobsDao jobsDao;

    @RequestMapping("/listJobs")
    public List<Jobs> listJobs() throws Exception {
        List<Jobs> res = jobsDao.findAll();
        return res.subList(0,20);
    }
}