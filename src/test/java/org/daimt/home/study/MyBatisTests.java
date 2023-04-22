package org.daimt.home.study;


import org.apache.ibatis.session.SqlSessionFactory;

import org.daimt.home.study.batis.dao.UserDao;
import org.daimt.home.study.batis.entity.User;
import org.daimt.home.study.batis.entity.User2;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisTests {

    @Autowired
    private UserDao mapper = null;

    /**
     *
     */
    @RepeatedTest(2)
    public void findAllUser(){
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void findAllUser2(){
        List<User2> userList = mapper.getUserList2();
        System.out.println("mapper =================== " + mapper);
        for (User2 user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void findUsers(){
        Map<String,Object> params = new HashMap<>();
        params.put("name","赵云");
//        params.put("pwd","123456");
        List<User> users = mapper.findUsers(params);
        System.out.println(users);
    }

    @Test
    public void updateUser(){
        Map<String,Object> params = new HashMap<>();
        params.put("id",1);
        params.put("name","赵云");
        params.put("pwd","1234567");
        int n = mapper.updateUser(params);
        System.out.println("count : " + n);
//        sqlSession.commit();
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setId(5);
        user.setName("关羽");
        user.setPwd("qwerty");
        mapper.addUser(user);
        System.out.println("id : " + user.getId());
//        sqlSession.commit();
    }

    @Test
    public void addUser2(){
        User user = new User();
        user.setId(5);
        user.setName("黄忠");
        user.setPwd("123321");
        mapper.addUser2(user);
        System.out.println("id : " + user.getId());
//        sqlSession.commit();
    }

    @Test
    public void findUserByIds(){
        List<Integer> ids = Arrays.asList(1,2,3,7);
        System.out.println(mapper.findUserByIds(ids));
    }

    @Test
    public void addUsers(){
        User user = new User();
        user.setName("张辽");
        user.setPwd("123321");

        User user2 = new User();
        user2.setName("夏侯惇");
        user2.setPwd("123321");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        int n = mapper.addUsers(users);
        System.out.println("count : " + n);
        System.out.println(users);
//        sqlSession.commit();
    }

    @Autowired
    private SqlSessionFactory factory;

    @RepeatedTest(1)
    public void useStatement(){
        System.out.println(factory.openSession().selectList("org.daimt.home.study.dao.UserDao.getUserList2"));
    }

}
