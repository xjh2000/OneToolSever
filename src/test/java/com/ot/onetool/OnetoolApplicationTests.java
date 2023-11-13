package com.ot.onetool;

import com.ot.onetool.Mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class OneToolApplicationTests {
    @Resource
    UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(userMapper.selectList(null));
    }

}
