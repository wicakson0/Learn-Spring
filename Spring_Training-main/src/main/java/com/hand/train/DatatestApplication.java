package com.hand.train;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.hand.train.mapper")
@EnableCaching
public class DatatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatatestApplication.class, args);
	}

}
