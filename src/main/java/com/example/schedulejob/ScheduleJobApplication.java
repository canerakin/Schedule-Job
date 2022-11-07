package com.example.schedulejob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
public class ScheduleJobApplication {
    Logger logger = LoggerFactory.getLogger(ScheduleJobApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ScheduleJobApplication.class, args);
    }


    @Scheduled(fixedRate = 60000L)  // 60 saniye
    public void job() {
        logger.info("Job :" + new Date());
    }




}