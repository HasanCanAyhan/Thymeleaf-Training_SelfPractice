package com.cydeo;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ThymeleafTrainingSelfPracticeApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ThymeleafTrainingSelfPracticeApplication.class, args);

        DataGenerator bootStrap = context.getBean(DataGenerator.class);
        bootStrap.createUsers();


    }

}
