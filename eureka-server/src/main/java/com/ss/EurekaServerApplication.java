package com.ss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("git dev");
		System.out.println("hhhh");
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}