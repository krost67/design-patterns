package com.podlasenko.example;

import com.podlasenko.example.entity.Address;
import com.podlasenko.example.entity.User;

import java.time.LocalDate;

public class TestData {

    public static User prepareTestUserEntity() {
        User user = new User();
        user.setBirthday(LocalDate.of(1965, 5, 6));
        user.setFirstName("Jack");
        user.setLastName("Sparrow");
        user.setAddress(prepareAddress());

        return user;
    }

    public static Address prepareAddress() {
        Address address = new Address();
        address.setHouseNumber("420");
        address.setStreet("State Street");
        address.setCity("Nassau");
        address.setState("Commonwealth of the Bahamas");
        address.setZipcode("00000");
        return address;
    }
}
