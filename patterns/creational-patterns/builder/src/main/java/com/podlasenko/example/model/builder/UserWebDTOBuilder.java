package com.podlasenko.example.model.builder;

import com.podlasenko.example.entity.Address;
import com.podlasenko.example.model.UserDTO;
import com.podlasenko.example.model.UserWebDTO;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private UserDTO userDTO;
    private String firstName;
    private String lastName;
    private String age;
    private String address;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        int ageInYears = Period.between(birthday, LocalDate.now()).getYears();
        this.age = String.valueOf(ageInYears);
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        StringBuilder addressBuilder = new StringBuilder();

        if (Objects.nonNull(address.getHouseNumber())) {
            addressBuilder.append("House number: ")
                    .append(address.getHouseNumber())
                    .append(" ");
        }
        if (Objects.nonNull(address.getStreet())) {
            addressBuilder.append("Street: ")
                    .append(address.getStreet())
                    .append(" ");
        }
        if (Objects.nonNull(address.getCity())) {
            addressBuilder.append("City: ")
                    .append(address.getCity())
                    .append(" ");
        }
        if (Objects.nonNull(address.getZipcode())) {
            addressBuilder.append("Zipcode: ")
                    .append(address.getZipcode())
                    .append(" ");
        }
        if (Objects.nonNull(address.getState())) {
            addressBuilder.append("State: ")
                    .append(address.getState())
                    .append(" ");
        }

        this.address = addressBuilder.toString().trim();
        return this;
    }

    @Override
    public UserDTO build() {
        this.userDTO = new UserWebDTO(prepareName(), address, age);
        return userDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userDTO;
    }

    private String prepareName() {
        String name = null;
        if (Objects.nonNull(firstName) && Objects.nonNull(lastName)) {
            name = firstName + " " + lastName;
        } else if (Objects.nonNull(firstName)) {
            name = firstName;
        } else if (Objects.nonNull(lastName)) {
            name = lastName;
        }

        return name;
    }
}
