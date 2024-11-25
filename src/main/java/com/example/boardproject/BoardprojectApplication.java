package com.example.boardproject;

import jakarta.annotation.PostConstruct;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootConfiguration // 추가
//@ComponentScan("com.example.boardproject") // 추가
@MapperScan("com.example.boardproject.mapper")
public class BoardprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(BoardprojectApplication.class, args);
	}
}
