package com.cydeo.model;

import com.cydeo.enums.Gender;
import com.cydeo.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String address;
    private State state;
    private int age;
    private Gender gender;
    private boolean married;



}
