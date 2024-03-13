package com.example.myga.controller;

import com.example.myga.enity.Bullet;
import com.example.myga.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("/sendbullet")
    public String sendBullet(@RequestBody Bullet bullet){
        if(videoService.sendBullet(bullet) >= 1){
            return "ok";
        }
        else return "error";
    }

    @RequestMapping("/getbullet")
    public List<Bullet> getBulletByVideo(int videoid){
        return videoService.getBulletByVideo(videoid);
    }
}
