package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"org.example.entity"})  // Adjust to your actual entity package
@EnableJpaRepositories(basePackages = {"org.example.repository"})  // Adjust to your repository package
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}