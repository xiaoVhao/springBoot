package com.example;

import com.example.web.TestProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/3/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Autowired
    private TestProperties blogProperties;
    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "钟钟钟");
        Assert.assertEquals(blogProperties.getTitle(), "架构师");
    }
}
