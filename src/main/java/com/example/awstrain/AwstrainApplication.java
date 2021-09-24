package com.example.awstrain;

import java.util.List;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwstrainApplication {

    @Autowired
    ProductRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AwstrainApplication.class, args);
    }


}
