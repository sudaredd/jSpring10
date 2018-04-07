package com.jSpring10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JSpring10Application {
	private static final Logger logger = LoggerFactory
            .getLogger(JSpring10Application.class);
	public static void main(String[] args) {
		logger.info("commit in branch1");
		SpringApplication.run(JSpring10Application.class, args);
	}
}
