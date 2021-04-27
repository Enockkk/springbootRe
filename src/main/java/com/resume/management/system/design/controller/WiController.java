package com.resume.management.system.design.controller;

import com.resume.management.system.design.dao.WiDao;
import com.resume.management.system.design.entity.Infomation;
import com.resume.management.system.design.entity.Wi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Transactional
@Controller
@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class WiController {
    @Autowired
    private WiDao wiDao;

    //findAll
    @GetMapping("/listWi")
    public List<Wi> listWi() throws Exception {
        //System.out.println("true");
        return wiDao.findAll();
    }

    //listCompany//?
    @GetMapping("/listCompany")
    public Wi listCompany(
            @RequestParam(value = "company") String company)
            throws Exception {
        List<Wi> wiList = wiDao.findByCompany(company);
        Wi wi = wiList.get(0);
        return wi;
    }

    //addWi
    @GetMapping("/addWi")
    public Boolean addWi (   @RequestParam(value = "id") int id,
                             @RequestParam(value = "company") String company,
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
            //判断id&&wid是否存在

//            System.out.println("+++++++++++++++++++++++++++++++");
            Wi wi = new Wi();
            List<Wi> res = wiDao.findByIdAndWid(id,wid);
//             System.out.println("++++++++++"  +res.toString());
            if(wiDao.findByIdAndWid(id,wid).size() < 1) {

//            wi.setId(Integer.parseInt(id));
                wi.setId(id);
                wi.setCompany(company);
//            wi.setWid(Integer.parseInt(wid));
                wi.setWid(wid);
                wi.setRname(rname);
                wi.setSex(sex);
                wi.setNation(nation);
                wi.setNativeplace(nativeplace);
                wi.setBirthday(birthday);
                wi.setEducation(education);
                wi.setMajor(major);
                wi.setEnglish(english);
                wi.setPolitic(politic);
                wi.setGraduation(graduation);
                wi.setPhone(phone);
                wi.setWorktarget(worktarget);
                wi.setInterest(interest);
                wi.setExperience(experience);
//            System.out.println(wi.toString());

                wiDao.save(wi);
                return true;
            }else {
                return false;
//            System.out.println("rname:"+rname);
            }
        } catch (Exception e) {
            return false;
        }
    }

}