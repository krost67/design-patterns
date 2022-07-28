package com.podlasenko.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Order extends Entity {

    private LocalDateTime orderPlacedOn;
    private double totalValue;
}
