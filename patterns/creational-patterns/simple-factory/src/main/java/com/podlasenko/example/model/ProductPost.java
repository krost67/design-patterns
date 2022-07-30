package com.podlasenko.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductPost extends Post {

    private String imageUrl;
    private String name;
}
