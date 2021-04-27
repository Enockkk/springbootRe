package com.resume.management.system.design.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
@Data
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "job_id")
    private int jobId;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "work_addr")
    private String workAddr;

    @Column(name = "salary")
    private String salary;

    @Column(name = "push_date")
    private String pushDate;

    @Column(name = "job_key")
    private String jobKey;

    @Column(name = "industry")
    private String industry;

    @Column(name = "underindustry")
    private String underindustry;

    @Column(name = "job_href")
    private String jobHref;

    @Column(name = "desc_string")
    private String descString;

}
