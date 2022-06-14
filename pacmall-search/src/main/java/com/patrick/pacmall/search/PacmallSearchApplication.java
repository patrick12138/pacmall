package com.patrick.pacmall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.patrick.pacmall.search.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class PacmallSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallSearchApplication.class, args);
	}

}
