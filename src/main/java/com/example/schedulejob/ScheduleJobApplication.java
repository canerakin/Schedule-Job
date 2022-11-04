package com.example.schedulejob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ScheduleJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleJobApplication.class, args);
    }
}
