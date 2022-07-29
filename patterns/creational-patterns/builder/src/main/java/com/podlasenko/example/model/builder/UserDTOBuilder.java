package com.podlasenko.example.model.builder;

import com.podlasenko.example.entity.Address;
import com.podlasenko.example.model.UserDTO;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthday(LocalDate birthday);

    UserDTOBuilder withAddress(Address address);

    UserDTO build();

    UserDTO getUserDTO();
}

