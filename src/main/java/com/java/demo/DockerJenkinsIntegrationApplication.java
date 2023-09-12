package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
	}
	@GetMapping("/msg")
	public String message() {
		System.out.println("Docker Jenkins integration....");
		return "Docker Jenkins integration....";
	}

}
