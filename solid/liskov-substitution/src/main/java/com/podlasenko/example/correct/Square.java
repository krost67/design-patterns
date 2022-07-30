package com.podlasenko.example.correct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Square implements Shape {
    private int side;

    @Override
    public int computeArea() {
        return side * side;
    }
}
