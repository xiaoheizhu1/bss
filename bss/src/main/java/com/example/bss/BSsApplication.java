
package com.example.bss;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/*@ComponentScan  
@EnableAutoConfiguration  
@EnableScheduling  
@Configuration  */
@SpringBootApplication()
public class BSsApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BSsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BSsApplication.class, args);
	}

}
