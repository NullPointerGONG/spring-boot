package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void testListUser() {
        QueryWrapper queryWrapper = new QueryWrapper<>();
        List<UserEntity> userEntities = userMapper.selectList(queryWrapper);
        userEntities.forEach(userEntity -> {
            assertThat(userEntity.getUserName().equals("hello"));
            assertThat(userEntity.getUserName().equals("demo1"));
        });
    }

    @Test
    public void testInsert() {
        log.info("测试test的事物");
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(String.valueOf(4));
        userEntity.setUserName("test3");
        userMapper.insert(userEntity);
        QueryWrapper queryWrapper = new QueryWrapper<>();
        List<UserEntity> userEntities = userMapper.selectList(queryWrapper);

    }

    @Test
    public void testDemo(){
        log.info("test delete");
        int i = userMapper.deleteById(String.valueOf(1));
        log.info("test delete over");
    }

}