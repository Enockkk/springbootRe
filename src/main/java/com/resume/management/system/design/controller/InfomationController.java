package com.resume.management.system.design.controller;

import com.resume.management.system.design.dao.InfomationDao;
import com.resume.management.system.design.entity.Admin;
import com.resume.management.system.design.entity.Infomation;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Transactional
@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class InfomationController {
    @Autowired
    private InfomationDao infomationDao;

    //查看所有resume
    @PostMapping("/listInfomation")
    public List<Infomation> listInfomation() throws Exception {
        //System.out.println("true");
        return infomationDao.findAll();
    }

    //listOneInfo
    @GetMapping("/listOneInfo")
    public Infomation listOneInfo(@RequestParam(value = "id") int id)
            throws Exception {
            List<Infomation> listOneInfo = infomationDao.findById(id);
            Infomation infomation = listOneInfo.get(0);
            return infomation;
    }

    //getEducation 接口还没实现
    @GetMapping("/getEducation")
    public List<Infomation> getEducation(@RequestParam(value = "education") String education)
            throws Exception {
//        System.out.println(education);
        System.out.println(infomationDao.findByEducation(education));
        return infomationDao.findByEducation(education);
    }

    //getGraduation 接口还没实现
    @GetMapping("/getGraduation")
    public List<Infomation> getGraduation(@RequestParam(value = "graduation") String graduation)
            throws Exception {
        System.out.println(graduation);
        return infomationDao.findByGraduation(graduation);
    }

    //getMajor
    @GetMapping("/getMajor")
    public String getMajor(
            @RequestParam(value = "id") int id)
            throws Exception {
        List<Infomation> infomationList = infomationDao.findById(id);
        Infomation infomation = infomationList.get(0);
        return infomation.getMajor();
    }

    //getWid 没必要
    @PostMapping("/listWid")
    public List<Infomation> listWid(@RequestParam(value = "wid") String wid)
            throws Exception {
        System.out.println(Integer.parseInt(wid));
        return infomationDao.findByWid(Integer.parseInt(wid));

    }

    //删除某resume
    @GetMapping("/deleteResume")
    public Boolean deletResume(@RequestParam(value = "id") int id){
        System.out.println("id: "+id);
        try{
            infomationDao.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    //修改wid
    @PostMapping("/rewid")
    public boolean rewid(@RequestParam(value = "id") int id,
                         @RequestParam(value = "wid") int wid)throws Exception {
        try {
            Infomation infomation =  infomationDao.findById(id).get(0);
//            System.out.println(id+"dafsaf"+wid);
//            System.out.println(infomation.toString());
//            infomation.setInfomationid(Integer.parseInt(id));
//            infomationDao.findById(id);
            infomation.setWid(wid);
            infomationDao.save(infomation);
            System.out.println("rewid:"+wid);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //添加resume
    @PostMapping("/addResume")
    public Boolean addResume(@RequestParam(value = "id") int id,
                             @RequestParam(value = "wid") int wid,
                             @RequestParam(value = "rname") String rname,
                             @RequestParam(value = "sex") String sex,
                             @RequestParam(value = "nation") String nation,
                             @RequestParam(value = "nativeplace") String nativeplace,
                             @RequestParam(value = "birthday") String birthday,
                             @RequestParam(value = "education") String education,
                             @RequestParam(value = "major") String major,
                             @RequestParam(value = "english") String english,
                             @RequestParam(value = "politic") String politic,
                             @RequestParam(value = "graduation") String graduation,
                             @RequestParam(value = "phone") String phone,
                             @RequestParam(value = "worktarget") String worktarget,
                             @RequestParam(value = "interest") String interest,
                             @RequestParam(value = "experience") String experience) throws Exception {
        try {

            Infomation infomation = new Infomation();
//            infomation.setInfomationid(Integer.parseInt(id));
            infomation.setId(id);
            infomation.setWid(wid);
            infomation.setRname(rname);
            infomation.setSex(sex);
            infomation.setNation(nation);
            infomation.setNativeplace(nativeplace);
            infomation.setBirthday(birthday);
            infomation.setEducation(education);
            infomation.setMajor(major);
            infomation.setEnglish(english);
            infomation.setPolitic(politic);
            infomation.setGraduation(graduation);
            infomation.setPhone(phone);
            infomation.setWorktarget(worktarget);
            infomation.setInterest(interest);
            infomation.setExperience(experience);
            System.out.println(infomation.toString());


            infomationDao.save(infomation);
            System.out.println("rname:"+rname);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}