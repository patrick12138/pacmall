package com.patrick.pacmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class PacmallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallGatewayApplication.class, args);
	}

}
