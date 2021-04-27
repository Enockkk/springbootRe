//package com.resume.management.system.design.controller;
//
//import com.resume.management.system.design.dao.UserDao;
//import com.resume.management.system.design.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
////@Controller
//@CrossOrigin
//@RestController
//@RequestMapping(value = "/api")
//public class UserController {
//
//    @Autowired
//    private UserDao userDao;
//
//    //注册
//  //  @RequestMapping(value = "/addUser", method = RequestMethod.POST)
//    public Boolean addUser(@RequestParam(value = "username") String username,
//                           @RequestParam(value = "password") String password,
//                           @RequestParam(value = "email") String email) throws Exception {
//        try {
//            User user = new User();
//            user.setName(username);
//            user.setPassword(password);
//            user.setEmail(email);
//            userDao.save(user);
////            System.out.println("username: " + username + "\npassword: " + password +
////                    "\nemail:" + email);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
////    hr注册
// //   @RequestMapping(value = "/addUserHr",method=RequestMethod.POST)
//    public Boolean addUserHr(@RequestParam(value = "rname") String rname,
//                             @RequestParam(value = "company") String company,
//                             @RequestParam(value = "job") String job) throws Exception {
//        try {
//            User user = new User();
//            user.setName(rname);
//            user.setCompany(company);
//            user.setJob(job);
//            userDao.save(user);
////            System.out.println("username: " + username + "\npassword: " + password +
////                    "\nemail:" + email);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
// //   @RequestMapping(value = "/oo",method=RequestMethod.POST)
//    public int test(){
//        return  userDao.addUserA("12314");
//    }
//
//    //    求职注册
// //   @RequestMapping(value = "/submitUser",method=RequestMethod.POST)
//    public Boolean addUserA(@RequestParam(value = "rname") String rname,
//                             @RequestParam(value = "school") String school,
//                              @RequestParam(value = "sex") String sex,
//                                @RequestParam(value = "political") String political,
//                                 @RequestParam(value = "address") String address,
//                                   @RequestParam(value = "exp") String exp,
//                                    @RequestParam(value = "grade") String grade,
//                                     @RequestParam(value = "userid") String userid,
//                            @RequestParam(value = "username") String username,
//                            @RequestParam(value = "password") String password,
//                            @RequestParam(value = "email") String email) throws Exception {
//        try {
//            User user = new User();
//            user.setUserid(Integer.parseInt(userid));
//            user.setRname(rname);
//            user.setSchool(school);
//            user.setSex(sex);
//            user.setPolitical(political);
//            user.setAddress(address);
//            user.setExp(exp);
//            user.setGrade(grade);
//            user.setName(username);
//            user.setPassword(password);
//            user.setEmail(email);
//            userDao.save(user);
////            System.out.println("username: " + username + "\npassword: " + password +
////                    "\nemail:" + email);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//
//    //登录
//  //  @PostMapping(value = "/checkpwd")
//    public User checkpwd(@RequestParam(value = "password") String password,
//                        @RequestParam(value = "username") String username
//                        ) throws Exception {
//        try {
//            List<User> userlist = userDao.findByName(username);
//            User user = userlist.get(0);
//            System.out.println("input密码: " + password + "\nreal密码: " + user.getPassword());
//            if (user.getPassword().equals(password)) {
//                System.out.println("userid："+user.getUserid());
//                return user;//String.valueOf(user.getUserid());
//            }
//        } catch (Exception e) {
//            return null;
//        }
//        return null;
//    }
//
//}
//
