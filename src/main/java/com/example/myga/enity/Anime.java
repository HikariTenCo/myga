package com.example.myga.enity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("anime")
public class Anime {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private String name;
    private String detail;
    private String time;
}
