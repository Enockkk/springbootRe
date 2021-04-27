package com.resume.management.system.design.controller;

import com.resume.management.system.design.dao.MasterDao;
import com.resume.management.system.design.entity.Master;
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
public class MasterController {
    @Autowired
    private MasterDao masterDao;

//    @Autowired
//    private PublishDao publishDao;

    //查看所有HrInfo //无接口
    @GetMapping("/listHrInfo")
    public List<Master> listHrInfo() throws Exception {
        //System.out.println("true");
        return masterDao.findAll();
    }

    //删除HrInfo //无接口
    @GetMapping("/deleteHrInfo")
    public Boolean deletHrInfo(@RequestParam(value = "id") int id) {
        System.out.println("id: " + id);
        try {
            masterDao.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //添加HrInfo
    @PostMapping("/addHrInfo")
    public Boolean addHrInfo(@RequestParam(value = "id") int id,
                             @RequestParam(value = "rname") String rname,
                             @RequestParam(value = "company") String company) throws Exception {
        try {
            Master master = new Master();
//            infomation.setInfomationid(Integer.parseInt(id));
            master.setId(id);
            master.setRname(rname);
            master.setCompany(company);
            masterDao.save(master);
//            List<Publish> res = publishDao.findById(id);
//            masterDao.addId(res.get(0).getId());
            System.out.println("company:" + company);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //getCompany
    @GetMapping("/getCompany")
    public String getCompany(
            @RequestParam(value = "id") int id)
            throws Exception {
        List<Master> masterList = masterDao.findById(id);
        Master master = masterList.get(0);
        return master.getCompany();
    }
}