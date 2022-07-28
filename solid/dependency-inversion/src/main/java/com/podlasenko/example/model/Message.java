package com.podlasenko.example.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class Message {

	private final String msg;
	private final LocalDateTime datetime;
	
	public Message(String msg) {
		this.msg = msg;
		this.datetime = LocalDateTime.parse(
				"2022-07-28 12:30",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
		);
	}
}
