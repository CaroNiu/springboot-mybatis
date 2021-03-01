package com.springboot.mybatis.service;

import com.springboot.mybatis.mapper.MovieMapper;
import com.springboot.mybatis.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Nuri
 * @CreateTime 2021/3/1
 * @Describe
 */
@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public Movie queryMovieByTitle(String title) {
        return movieMapper.findMovieByTitle(title);
    }

    @Override
    public Movie queryMovieByIdFirst(Integer id) {
        return movieMapper.findMovieByIdFirst(id);
    }

    @Override
    public Movie queryMovieByIdSecond(Integer id) {
        return movieMapper.queryMovieByIdSecond(id);
    }
}
