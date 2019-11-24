package com.fc.dtcDemo;

import com.fc.dtc.annotation.DTCMapperScanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 @DTCMapperScanner(basePackages = "com.fc.dtcDemo.bean")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}
