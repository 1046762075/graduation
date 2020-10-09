package com.gq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan
public class graduation {
    public static void main(String[] args) {
        SpringApplication.run(graduation.class, args);
    }

//	public class DemoApplication extends SpringBootServletInitializer {
//		@Override
//		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//			return builder.sources(DemoApplication.class);
//		}
//	}
}
