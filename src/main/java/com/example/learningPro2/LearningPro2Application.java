package com.example.learningPro2;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LearningPro2Application {

	public static void main(String[] args) {
		//SpringApplication.run(LearningPro2Application.class, args);
		SpringApplication app = new SpringApplication(LearningPro2Application.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "9004"));
        app.run(args);
	}

}
