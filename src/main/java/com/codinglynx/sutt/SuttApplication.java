package com.codinglynx.sutt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SuttApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuttApplication.class, args);
	}

}
