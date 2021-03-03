package com.springboot.mybatis.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("电影的实体类")
public class Movie {
    // 实体类中的名字和数据库中的名称未对应
    @ApiModelProperty("电影ID")
    private Integer id;
    @ApiModelProperty("导演")
    private String directors;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("内容")
    private String cover;
    @ApiModelProperty("进度")
    private String rate;
    @ApiModelProperty("结果")
    private String casts;

}
