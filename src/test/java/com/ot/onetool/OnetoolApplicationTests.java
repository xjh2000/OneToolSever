package com.ot.onetool;

import com.ot.onetool.Mapper.UserMapper;
import com.ot.onetool.POJO.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;

@SpringBootTest

class OnetoolApplicationTests {
    @Resource
    UserMapper userMapper;
    @Test
    void contextLoads() {
        userMapper.insert(new User());
    }

}
