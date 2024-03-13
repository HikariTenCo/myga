package com.example.myga.service;

import com.example.myga.enity.Bullet;

import java.util.List;

public interface VideoService {
    int sendBullet(Bullet bullet);
    List<Bullet> getBulletByVideo(int videoid);
}
