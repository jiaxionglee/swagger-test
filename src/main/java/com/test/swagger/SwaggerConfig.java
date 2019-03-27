package com.test.swagger;


import com.google.common.base.Predicate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
@ConditionalOnExpression("${swagger.enable:true}")
@ComponentScan(basePackages = {"com.test.swagger.controller"})
@SpringBootApplication
public class SwaggerConfig {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerConfig.class, args);
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths())
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("《--Swagger生成API文档演示案例--》")//标题
                .termsOfServiceUrl("")
                .description("演示API文档生成的过程")//描述
                .version("1.0.0")//版本号
                .build();
    }

    //可以匹配满足下面条件的任何一个表达式
    private Predicate<String> paths() {
        return or(
                regex("/api/.*"),
                regex("/some.*"),
                regex("/contacts.*"),
                regex("/pet.*"),
                regex("/springsRestController.*"),
                regex("/test.*"));
    }

}
