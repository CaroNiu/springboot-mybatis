package com.springboot.mybatis.controller;

import com.springboot.mybatis.pojo.Movie;
import com.springboot.mybatis.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/")
    public String openMovie(){
        return "movie";
    }

    @RequestMapping("/movie/{title}")
//    @ResponseBody
    public String findMovirByTitle(@PathVariable("title") String title, Model model){
        Movie movie = movieService.queryMovieByTitle(title);
        model.addAttribute("movieOne",movie);
        return "movie";
    }

    @RequestMapping("/movie/first/{id}")
    public String findMovieByIdFirst(@PathVariable("id") Integer id,Model model){
        Movie movie = movieService.queryMovieByIdFirst(id);
        model.addAttribute("movieFirst",movie);
        return "movie";
    }

    @RequestMapping("/movie/second/{id}")
    public String findMovieByIdSecond(@PathVariable("id") Integer id,Model model){
        Movie movie = movieService.queryMovieByIdSecond(id);
        model.addAttribute("movieSecond",movie);
        return "movie";
    }

}
