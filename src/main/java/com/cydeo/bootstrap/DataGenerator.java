package com.cydeo.bootstrap;

import com.cydeo.enums.Gender;
import com.cydeo.enums.State;
import com.cydeo.model.User;
import com.cydeo.service.UserService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator {

    private final UserService userService;

    public DataGenerator(UserService userService) {
        this.userService = userService;
    }


    public void createUsers(){

        Faker faker = new Faker();

        for (int i = 0; i < 10 ; i++) {

            Gender gender = Gender.FEMALE;

            boolean isMarried = i %3 == 0 ? true : false;
            if (i %2 == 0) gender = Gender.MALE;

            State state = State.values()[i];

            userService.save(new User(faker.name().firstName(),faker.name().lastName(),faker.address().fullAddress(),state,faker.number().numberBetween(18,75),gender,isMarried));

        }

    }

}
