package com.springboot.mybatis.mapper;

import com.springboot.mybatis.pojo.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Nuri
 * @CreateTime 2021/3/1
 * @Describe
 */
@Repository
@Mapper
public interface MovieMapper {

    /**
     * 根据标题查询电影
     * @param title
     * @return
     */
    public Movie findMovieByTitle(String title);

    /**
     * 根据Id查询，别名测试2
     * @param id
     * @return
     */
    public Movie findMovieByIdFirst(Integer id);

    /**
     * 根据Id查询，别名测试2
     * @param id
     * @return
     */
    public Movie queryMovieByIdSecond(Integer id);
}
