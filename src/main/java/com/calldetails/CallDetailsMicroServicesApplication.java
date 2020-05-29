package com.calldetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CallDetailsMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallDetailsMicroServicesApplication.class, args);
	}
	
	@Bean
	public Docket docket() {
		ApiInfo info=new ApiInfoBuilder()
				.title("Call Detail MicroService Rest Documentation")
				.description("CallDetaisl Rest End Points for for getting call details ")
				.contact(new Contact("rakesh", null, "rakeshsunkari95@gmail.com"))
				.license("sathyatech").licenseUrl("http://www.sathyatech.com")
				.build();
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.calldetails.controller"))
				.paths(PathSelectors.any())
				.build().apiInfo(info);
	}

}
