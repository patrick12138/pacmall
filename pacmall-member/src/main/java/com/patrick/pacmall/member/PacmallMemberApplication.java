package com.patrick.pacmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.patrick.pacmall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class PacmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallMemberApplication.class, args);
	}

}
