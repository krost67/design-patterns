package com.podlasenko.example.model;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class UserWebDTO implements UserDTO {

    private final String name;
    private final String address;
    private final String age;

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
