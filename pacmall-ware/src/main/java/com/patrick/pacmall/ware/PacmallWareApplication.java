package com.patrick.pacmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PacmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallWareApplication.class, args);
	}

}
