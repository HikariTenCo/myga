package com.example.myga.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.myga.enity.Anime;
import com.example.myga.mapper.AnimeMapper;
import com.example.myga.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServiceImpl extends ServiceImpl<AnimeMapper, Anime> implements AnimeService {
    @Autowired
    private AnimeMapper animeMapper;

    @Override
    public List<Anime> getAllAnime() {
        return animeMapper.selectList(null);
    }
}
