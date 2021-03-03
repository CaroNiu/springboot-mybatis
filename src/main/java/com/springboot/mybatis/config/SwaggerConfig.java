package com.springboot.mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author Nuri
 * @CreateTime 2021/3/3
 * @Describe
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {


    /**
     * 当需要配置多个分组是可配置多个Docket
     * @return
     */
    @Bean
    public Docket docketTestOne(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfoTestOne())
                .enable(true)
                .groupName("niuheng")
                .select()
                .build();
    }

    /**
     * 可添加根据当前环境配置是否生效swagger
     *
     * @param environment
     * @return
     */
    @Bean
    public Docket docket(Environment environment){
        // 设置要显示的swagger环境
        Profiles profiles = Profiles.of("dev", "test");
        boolean b = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(b)
                .groupName("Nuri")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.mybatis.controller"))
                .build();
    }

    public ApiInfo apiInfo(){
        Contact contact = new Contact("Nuri","https://github.com/CreaterNuri?tab=repositories", "1441300177@qq.com");
        return new ApiInfo("Api Documentation", "Api Documentation", "1.0", "urn:tos", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }

    public ApiInfo apiInfoTestOne(){
        Contact contact = new Contact("niuheng","https://github.com/CreaterNuri?tab=repositories", "17686996800@163.com");
        return new ApiInfo("Api Documentation", "Api Documentation", "1.0", "urn:tos", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }


    /**
     * 解决swagger被拦截的问题
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
