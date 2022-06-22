package com.patrick.pacmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.redisson.spring.session.config.EnableRedissonHttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@EnableFeignClients(basePackages = "com.patrick.pacmall.product.feign")
@MapperScan("com.patrick.pacmall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class PacmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallProductApplication.class, args);
	}

}
