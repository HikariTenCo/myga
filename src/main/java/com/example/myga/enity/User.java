package com.example.myga.enity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Transient;


@Data
@TableName("user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private String userName;
    private String password;
    private String account;
    private String email;
    private String picture;
    private String role;

    @Transient
    protected String token;
}
