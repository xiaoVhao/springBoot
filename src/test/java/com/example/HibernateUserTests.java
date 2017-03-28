package com.example;

import com.example.domain.Hibernate_User;
import com.example.service.Hibernate_UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/3/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateUserTests {
    @Autowired
    private Hibernate_UserService userRepository;
    @Test
    public void test() throws Exception {
        // 创建10条记录
        userRepository.save(new Hibernate_User("AAA",10));
        userRepository.save(new Hibernate_User("BBB", 20));
        userRepository.save(new Hibernate_User("CCC", 30));
        userRepository.save(new Hibernate_User("DDD", 40));
        userRepository.save(new Hibernate_User("EEE", 50));
        userRepository.save(new Hibernate_User("FFF", 60));
        userRepository.save(new Hibernate_User("GGG", 70));
        userRepository.save(new Hibernate_User("HHH", 80));
        userRepository.save(new Hibernate_User("III", 90));
        userRepository.save(new Hibernate_User("JJJ", 100));
        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, userRepository.findAll().size());
        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());
        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());
        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());
        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByName("AAA"));
        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, userRepository.findAll().size());
    }
}
