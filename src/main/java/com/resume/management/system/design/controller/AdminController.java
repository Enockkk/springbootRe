package com.resume.management.system.design.controller;

import com.resume.management.system.design.dao.AdminDao;
import com.resume.management.system.design.dao.InfomationDao;
import com.resume.management.system.design.dao.MasterDao;
import com.resume.management.system.design.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class AdminController {
    @Autowired
    private AdminDao adminDao;

    @Autowired
    private InfomationDao infomationDao;

    @Autowired
    private MasterDao masterDao;
    //注册
    @RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
    public Boolean addUser(@RequestParam(value = "name") String name,
                           @RequestParam(value = "password") String password,
                           @RequestParam(value = "email") String email) throws Exception {
        try {
            Admin admin = new Admin();
            admin.setName(name);
            admin.setPassword(password);
            admin.setEmail(email);
            adminDao.save(admin);
            List<Admin> res = adminDao.findByName(name);
//      没写完
            infomationDao.addId(res.get(0).getId());
            masterDao.addId(res.get(0).getId());

            System.out.println("name: " + name + "\npassword: " + password +
                    "\nemail:" + email);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

        //登录
    @PostMapping(value = "/checkpwd")
    public Admin checkpwd(@RequestParam(value = "password") String password,
                        @RequestParam(value = "name") String name
                        ) throws Exception {
        try {
            List<Admin> adminlist = adminDao.findByName(name);
            Admin admin = adminlist.get(0);
            System.out.println("input密码: " + password + "\nreal密码: " + admin.getPassword());
            if (admin.getPassword().equals(password)) {
//                System.out.println(admin.getPassword()+" ====== "+password);
                System.out.println("adminid："+admin.getId());
                return admin;//String.valueOf(user.getUserid());
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
