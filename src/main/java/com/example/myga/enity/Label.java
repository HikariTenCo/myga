package com.example.myga.enity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("label")
public class Label {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private int videoId;
    private int labelId;
}