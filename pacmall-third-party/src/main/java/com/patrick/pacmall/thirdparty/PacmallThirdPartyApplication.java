package com.patrick.pacmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class PacmallThirdPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallThirdPartyApplication.class, args);
	}

}
