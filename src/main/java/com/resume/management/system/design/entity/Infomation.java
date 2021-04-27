package com.resume.management.system.design.entity;

import javax.persistence.*;

@Entity
@Table(name = "infomation")
public class Infomation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "wid")
    private int wid;

    @Column(name = "rname")
    private String rname;

    @Column(name = "sex")
    private String sex;

    @Column(name = "nation")
    private String nation;

    @Column(name = "nativeplace")
    private String nativeplace;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "education")
    private String education;

    @Column(name = "major")
    private String major;

    @Column(name = "english")
    private String english;

    @Column(name = "politic")
    private String politic;

    @Column(name = "graduation")
    private String graduation;

    @Column(name = "phone")
    private String phone;

    @Column(name = "worktarget")
    private String worktarget;

    @Column(name = "interest")
    private String interest;

    @Column(name = "experience")
    private String experience;

    public void Infomation(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPolitic() {
        return politic;
    }

    public void setPolitic(String politic) {
        this.politic = politic;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorktarget() {
        return worktarget;
    }

    public void setWorktarget(String worktarget) {
        this.worktarget = worktarget;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Infomation{" +
                "id=" + id +
                ", wid=" + wid +
                ", rname='" + rname + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", nativeplace='" + nativeplace + '\'' +
                ", birthday='" + birthday + '\'' +
                ", education='" + education + '\'' +
                ", major='" + major + '\'' +
                ", english='" + english + '\'' +
                ", politic='" + politic + '\'' +
                ", graduation='" + graduation + '\'' +
                ", phone='" + phone + '\'' +
                ", worktarget='" + worktarget + '\'' +
                ", interest='" + interest + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
