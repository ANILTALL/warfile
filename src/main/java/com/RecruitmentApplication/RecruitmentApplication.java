package com.RecruitmentApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RecruitmentApplication extends SpringBootServletInitializer {
	@GetMapping("/work")
	public String getValue() {
		return "RecruitmentApplication working";
	}
	public static void main(String[] args) {
		SpringApplication.run(RecruitmentApplication.class, args);
		
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RecruitmentApplication.class);
	}

}
