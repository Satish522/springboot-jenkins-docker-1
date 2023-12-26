package com.satish.jenkin.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootJenkinsDocker1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDocker1Application.class, args);
	}
	
	@GetMapping("/docker")
	public String welcome() {
		return "Publish another app to Docker";
	}
}
