package org.daimt.home.study;


import com.github.pagehelper.PageHelper;
import org.apache.commons.logging.Log;
import org.daimt.home.study.batis.dao.UserDaoAnno;
import org.daimt.home.study.batis.entity.User;
import org.daimt.home.study.batis.entity.User2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest

public class MyBatisTestsAnno {
    @Autowired
    private UserDaoAnno mapper = null;

    @Test
    public void getUserList(){
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void getUserList2(){
//        PageHelper.offsetPage(7,5,false);
        PageHelper.startPage(2, 3,false);
        List<User2> userList = mapper.getUserList2();
        for (User2 user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void getUserList3(){
        List<User> userList = mapper.getUserList3(0,3);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void findUserById(){
        System.out.println(mapper.findUserById(1L));
    }

    private Log log = org.apache.commons.logging.LogFactory.getLog(MyBatisTestsAnno.class);
    /**
     * 使用配置文件
     */
    @Test
    public void findUserByIds(){
        List<Integer> ids = Arrays.asList(1,2,3,7);
        System.out.println(mapper.findUserByIds(ids));
    }
}
