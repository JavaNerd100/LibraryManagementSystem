package com.GouravThakur.LibraryManagementSystem.DbConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final Contact Default_Contact = new Contact("Gourav Thakur"
            ,"Library-management-system-api-data","gt09718@gmail.com");
    public static final ApiInfo Default_Api_Info = new ApiInfo("Library Management System"
            ,"My-Awesome-Api", "1.0.0","urn:tos" +
            "","Default_Contact","Apache2.0"
            ,"Library-management-system-api-data");

    @Bean(name = "swagger ")
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(Default_Api_Info);
    }


}
