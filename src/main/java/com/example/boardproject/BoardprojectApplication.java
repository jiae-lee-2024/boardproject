package com.example.boardproject;

import jakarta.annotation.PostConstruct;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.boardproject.mapper")
public class BoardprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(BoardprojectApplication.class, args);
	}
}
