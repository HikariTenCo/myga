package com.example.myga.enity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("video")
public class Video {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private String address;
    private String status;
    private String videoName;
    private int authorId;
    private int animeId;
    private int p;
    private int viewCount;
    private int markCount;
    private Long time;

}
