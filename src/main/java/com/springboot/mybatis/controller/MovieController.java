package com.springboot.mybatis.controller;

import com.springboot.mybatis.pojo.Movie;
import com.springboot.mybatis.service.IMovieService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Nuri
 * @CreateTime 2021/3/1
 * @Describe
 */
@Controller
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @ApiModelProperty("主界面请求")
    @GetMapping("/")
    public String openMovie(){
        return "movie";
    }

    @ApiModelProperty("根据标题查询电影信息")
    @GetMapping("/movie/{title}")
    public String findMovirByTitle(@PathVariable("title") String title, Model model){
        Movie movie = movieService.queryMovieByTitle(title);
        model.addAttribute("movieOne",movie);
        return "movie";
    }

    @ApiModelProperty("根据ID查询电影信息")
    @GetMapping("/movie/first/{id}")
    public String findMovieByIdFirst(@PathVariable("id") Integer id,Model model){
        Movie movie = movieService.queryMovieByIdFirst(id);
        model.addAttribute("movieFirst",movie);
        return "movie";
    }

    @ApiModelProperty("根据Id查询电影")
    @GetMapping("/movie/second/{id}")
    public String findMovieByIdSecond(@PathVariable("id") Integer id,Model model){
        Movie movie = movieService.queryMovieByIdSecond(id);
        model.addAttribute("movieSecond",movie);
        return "movie";
    }

    @PostMapping("/favmovie")
    @ResponseBody
    public Movie getMoveiBytitle(String title){
        Movie movie = movieService.queryMovieByTitle(title);
        return movie;
    }
}
