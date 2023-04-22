package org.daimt.home.study;

import com.github.pagehelper.PageHelper;
import org.daimt.home.study.batis.dao.RoleDao;
import org.daimt.home.study.batis.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusTests {
    @Autowired
    private RoleDao roleDao;

    @Test
    public void insert(){
        for(int i = 0; i < 10; i++){
            Role role = new Role();
            role.setName("admin");
            role.setDescription("--------admin--------");
            roleDao.insert(role);
            System.out.println(role);
        }
    }

    @Test
    public void update(){
        Role role = new Role();
        role.setId(37);
        role.setName("manager");
        role.setDescription("--------manager2222--------");
//        role.setVersion(1000);
        roleDao.updateById(role);
    }

    @Test
    public void findAll(){
        PageHelper.startPage(2,5);
        roleDao.selectList(null).forEach(System.out::println);
    }

    @Test
    public void testOptimisticLocker(){
        Role role = roleDao.selectById(37);
        role.setDescription("manager");
        System.out.println("role =============== " + role.getClass());
        roleDao.updateById(role);
    }

    @Test
    public void delete(){
        roleDao.deleteById(40);
    }
}
