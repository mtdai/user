package org.daimt.home.study.batis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.daimt.home.study.batis.entity.Role;

@Mapper
public interface RoleDao extends BaseMapper<Role> {
}
