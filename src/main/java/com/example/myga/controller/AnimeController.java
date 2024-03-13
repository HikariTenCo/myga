package com.example.myga.controller;

import com.example.myga.enity.Anime;
import com.example.myga.service.AnimeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anime")
@CrossOrigin
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @GetMapping("/animes")
    public List<Anime> getAnimeInfo(HttpServletRequest request){
        return animeService.getAllAnime();
    }
}
