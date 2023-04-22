package org.daimt.home.study.batis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.daimt.home.study.batis.entity.User;
import org.daimt.home.study.batis.entity.User2;

import java.util.List;

@Mapper
public interface UserDaoAnno {

    @Select("select * from user")
    List<User> getUserList();

    @Select("select * from user")
    @Results(id="User2", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "name"),
            @Result(property = "password", column = "pwd")
    })
    List<User2> getUserList2();

    @Select("select * from user limit #{offset}, #{size}")
    List<User> getUserList3(@Param("offset") int offset, @Param("size") int size);

    @ResultMap("User2")
    @Select("select * from user where id = #{id}")
    User2 findUserById(@Param("id") Long id);

    List<User> findUserByIds(List<Integer> ids);
}
