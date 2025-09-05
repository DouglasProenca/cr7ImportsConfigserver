package com.sistema.cr7ImportsConfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Cr7ImportsConfigserver {

	public static void main(String[] args) {
		SpringApplication.run(Cr7ImportsConfigserver.class, args);
	}

}
