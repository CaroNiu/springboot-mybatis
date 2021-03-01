package com.springboot.mybatis.service;

import com.springboot.mybatis.pojo.Movie;

/**
 * @author Nuri
 * @CreateTime 2021/3/1
 * @Describe
 */
public interface IMovieService {
    /**
     * 正常查询
     * @param title
     * @return
     */
    public Movie queryMovieByTitle(String title);

    /**
     * 别名测试1
     * @param id
     * @return
     */
    public Movie queryMovieByIdFirst(Integer id);

    /**
     * 别名测试2
     * @param id
     * @return
     */
    public Movie queryMovieByIdSecond(Integer id);

}
