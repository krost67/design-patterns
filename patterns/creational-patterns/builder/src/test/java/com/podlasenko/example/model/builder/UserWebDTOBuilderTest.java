package com.podlasenko.example.model.builder;

import com.podlasenko.example.entity.User;
import com.podlasenko.example.model.UserDTO;
import org.junit.Before;
import org.junit.Test;

import static com.podlasenko.example.TestData.prepareTestUserEntity;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserWebDTOBuilderTest {

    private UserDTOBuilder userDTOBuilder;

    @Before
    public void setup() {
        userDTOBuilder = new UserWebDTOBuilder();
    }

    @Test
    public void build_ShouldReturnCorrectResult_WhenAllEntityFieldsAvailable() {
        User userEntity = prepareTestUserEntity();

        UserDTO userDTO = userDTOBuilder
                .withFirstName(userEntity.getFirstName())
                .withLastName(userEntity.getLastName())
                .withBirthday(userEntity.getBirthday())
                .withAddress(userEntity.getAddress())
                .build();

        assertNotNull(userDTO);
        assertEquals("Jack Sparrow", userDTO.getName());
        assertEquals("House number: 420 Street: State Street City: Nassau Zipcode: 00000 State: Commonwealth of the Bahamas", userDTO.getAddress());
        assertEquals("57", userDTO.getAge());
    }
}
