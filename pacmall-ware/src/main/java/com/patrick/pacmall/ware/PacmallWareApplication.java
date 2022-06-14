package com.patrick.pacmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableFeignClients(basePackages = "com.patrick.pacmall.ware.feign")
@MapperScan("com.patrick.pacmall.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class PacmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallWareApplication.class, args);
	}

}
