package org.daimt.home.study.batis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.daimt.home.study.batis.entity.User;
import org.daimt.home.study.batis.entity.User2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Mapper
//@Repository
public interface UserDao {

    List<User> getUserList();

    List<User2> getUserList2();

    List<User> findUsers(Map<String,Object> params);

    int updateUser(Map<String,Object> params);

    void addUser(User user);

    void addUser2(User user);

    List<User> findUserByIds(List<Integer> ids);

    int addUsers(List<User> users);
}
