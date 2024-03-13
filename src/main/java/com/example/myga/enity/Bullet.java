package com.example.myga.enity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("bullet")
public class Bullet {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private String comment;
    private String username;
    private Long time;
    private String color;
    private int videoid;
}
