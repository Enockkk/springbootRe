package com.resume.management.system.design.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "userid")
    private int userid;

    @Column(name = "username")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "rname")
    private String rname;

    @Column(name = "company")
    private String company;

    @Column(name = "job")
    private String job;

    @Column(name = "school")
    private String school;

    @Column(name = "sex")
    private String sex;

    @Column(name = "political")
    private String political;

    @Column(name = "address")
    private String address;

    @Column(name = "exp")
    private String exp;

    @Column(name = "grade")
    private String grade;

    public User() {
    }

    public User(int userid, String name, String password, String email,
                String rname, String company, String job, String school,
                String sex, String political, String address, String exp,
                String grade
    ) {
        this.userid = userid;
        this.name = name;
        this.password = password;
        this.email = email;
        this.rname = rname;
        this.company = company;
        this.job = job;
        this.school = school;
        this.sex = sex;
        this.political = political;
        this.address = address;
        this.exp = exp;
        this.grade = grade;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}





