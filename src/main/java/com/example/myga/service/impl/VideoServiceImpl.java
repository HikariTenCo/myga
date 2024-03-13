package com.example.myga.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.myga.enity.Bullet;
import com.example.myga.enity.Video;
import com.example.myga.mapper.BulletMapper;
import com.example.myga.mapper.VideoMapper;
import com.example.myga.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService{
    @Autowired
    private BulletMapper bulletMapper;

    @Override
    public int sendBullet(Bullet bullet) {
        return bulletMapper.insert(bullet);
    }

    @Override
    public List<Bullet> getBulletByVideo(int videoid) {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("videoid", videoid);
        return bulletMapper.selectList(wrapper);
    }
}
