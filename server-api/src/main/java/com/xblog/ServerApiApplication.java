package com.xblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.xblog"})
public class ServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApiApplication.class, args);
	}

}
