package com.patrick.pacmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class PacmallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallOrderApplication.class, args);
	}

}
