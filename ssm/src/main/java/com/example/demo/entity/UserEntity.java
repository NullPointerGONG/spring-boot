package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_sys_user")
public class UserEntity {
    private String userId;
    private String userName;
}
