package com.podlasenko.example.correct;

import lombok.Data;

/*
 *  Basic class
 *  open for extension, closed for modification
 */
@Data
public abstract class Subscriber {

    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private Integer baseRate;

    public abstract Double calculateBill();
}
