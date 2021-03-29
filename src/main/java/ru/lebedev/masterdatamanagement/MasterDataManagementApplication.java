package ru.lebedev.masterdatamanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MasterDataManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterDataManagementApplication.class, args);
    }
}
