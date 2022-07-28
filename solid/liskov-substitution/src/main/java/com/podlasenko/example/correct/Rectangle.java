package com.podlasenko.example.correct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle implements Shape {
	private int width;
	private int height;

	public int computeArea() {
		return width * height;
	}
}
