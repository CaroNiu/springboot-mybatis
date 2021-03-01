package com.springboot.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.INTERNAL;

/**
 * @author Nuri
 * @CreateTime 2021/3/1
 * @Describe
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    // 实体类中的名字和数据库中的名称未对应
    private Integer id;
    private String directors;
    private String title;
    private String cover;
    private String rate;
    private String casts;

}
