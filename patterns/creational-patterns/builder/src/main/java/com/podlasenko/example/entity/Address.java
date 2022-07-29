package com.podlasenko.example.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

	private String houseNumber;
	private String street;
	private String city;
	private String zipcode;
	private String state;
}
