package com.resume.management.system.design.dao;

import com.resume.management.system.design.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    //      @Query("UPDATE user set school= :school,password = 'aaa' where userid = 20")
//    Boolean addUserA(@Param(value = "rname") String rname,
//                            @Param(value = "school") String school,
//                            @Param(value = "sex") String sex,
//                            @Param(value = "political") String political,
//                            @Param(value = "address") String address,
//                            @Param(value = "exp") String exp,
//                            @Param(value = "grade") String grade,
//                            @Param(value = "userid") String userid,
//                            @Param(value = "username") String username,
//                            @Param(value = "password") String password,
//                            @Param(value = "email") String email);
    @Transactional
    @Modifying
    @Query(value = "UPDATE user set rname = :rname where userid = 20", nativeQuery = true)
    int addUserA(@Param(value = "rname") String rname);

    public List<User> findByName(String name);

    public List<User> findByUserid(int userid);
}
