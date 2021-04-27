package com.resume.management.system.design.controller;

import com.resume.management.system.design.dao.PublishDao;
import com.resume.management.system.design.entity.Admin;
import com.resume.management.system.design.entity.Infomation;
import com.resume.management.system.design.entity.Master;
import com.resume.management.system.design.entity.Publish;
import org.omg.CORBA.INTERNAL;
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
public class PublishController {
    @Autowired
    private PublishDao publishDao;

    //查看岗位信息
    @GetMapping("/listPublish")
    public List<Publish> listPublish() throws Exception {
        //System.out.println("true");
        return publishDao.findAll();
    }

    //推荐岗位信息
    @GetMapping("/listRecom")
    public Publish listRecom(@RequestParam(value = "cmajor") String cmajor) throws Exception {
        System.out.println(cmajor);
        List<Publish> publishlist = publishDao.findByCmajor(cmajor);
        Publish publish = publishlist.get(0);
        return publish;

    }

    //删除岗位信息
    @GetMapping("/deletePublish")
    public Boolean deletPublish(@RequestParam(value = "wid") int wid){
        System.out.println("wid: "+wid);
        try{
            publishDao.deleteById(wid);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    //发布岗位信息
    @PostMapping("/addPublish")
    public Boolean addPublish(
//            @RequestParam(value = "wid") int wid,
                              @RequestParam(value = "cname") String cname,
                              @RequestParam(value = "cwork") String cwork,
                              @RequestParam(value = "ceducation") String ceducation,
                              @RequestParam(value = "cmajor") String cmajor,
                              @RequestParam(value = "cwage") String cwage,
                              @RequestParam(value = "cexp") String cexp,
                              @RequestParam(value = "ccity") String ccity,
                              @RequestParam(value = "ctime") String ctime,
                              @RequestParam(value = "ctype") String ctype,
                              @RequestParam(value = "cintro") String cintro
                              ) throws Exception {
        try {
            Publish publish = new Publish();
//            infomation.setInfomationid(Integer.parseInt(id));
//            publish.setWid(wid);
            publish.setCname(cname);
            publish.setCwork(cwork);
            publish.setCeducation(ceducation);
            publish.setCmajor(cmajor);
            publish.setCwage(cwage);
            publish.setCexp(cexp);
            publish.setCcity(ccity);
            publish.setCtime(ctime);
            publish.setCtype(ctype);
            publish.setCintro(cintro);
            publishDao.save(publish);

            System.out.println("cwork:" + cwork);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}