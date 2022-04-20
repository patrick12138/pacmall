package com.patrick.pacmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.patrick.pacmall.product.dao")
public class PacmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacmallProductApplication.class, args);
	}

}
