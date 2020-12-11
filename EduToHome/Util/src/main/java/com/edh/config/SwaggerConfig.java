package com.edh.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${swagger.basepackage}")
    private String basepackage;
    @Value("${swagger.title}")
    private String title;
    @Value("${swagger.descri}")
    private String descri;
    @Value("${swagger.version}")
    private String vsesion;
    @Value("${swagger.contact}")
    private String contact;
    @Value("${swagger.url}")
    private String url;
    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(basepackage))
                .paths(PathSelectors.any())
                .build();
    }
    public ApiInfo getApiInfo(){

        return new ApiInfoBuilder()
                .title(title)
                .description(descri)
                .contact(contact)
                .version(vsesion)
                .licenseUrl(url)
                .build();
    }
}