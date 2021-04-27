package com.resume.management.system.design.entity;

import javax.persistence.*;

@Entity
@Table(name = "publish")
public class Publish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "wid")
    private int wid;

    @Column(name = "cname")
    private String cname;

    @Column(name = "cwork")
    private String cwork;

    @Column(name = "ceducation")
    private String ceducation;

    @Column(name = "cmajor")
    private String cmajor;

    @Column(name = "cwage")
    private String cwage;

    @Column(name = "cexp")
    private String cexp;

    @Column(name = "ccity")
    private String ccity;

    @Column(name = "ctime")
    private String ctime;

    @Column(name = "ctype")
    private String ctype;

    @Column(name = "cintro")
    private String cintro;

    public void Publish(){
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCwork() {
        return cwork;
    }

    public void setCwork(String cwork) {
        this.cwork = cwork;
    }

    public String getCeducation() {
        return ceducation;
    }

    public void setCeducation(String ceducation) {
        this.ceducation = ceducation;
    }

    public String getCmajor() {
        return cmajor;
    }

    public void setCmajor(String cmajor) {
        this.cmajor = cmajor;
    }

    public String getCwage() {
        return cwage;
    }

    public void setCwage(String cwage) {
        this.cwage = cwage;
    }

    public String getCexp() {
        return cexp;
    }

    public void setCexp(String cexp) {
        this.cexp = cexp;
    }

    public String getCcity() {
        return ccity;
    }

    public void setCcity(String ccity) {
        this.ccity = ccity;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String getCintro() {
        return cintro;
    }

    public void setCintro(String cintro) {
        this.cintro = cintro;
    }
}
