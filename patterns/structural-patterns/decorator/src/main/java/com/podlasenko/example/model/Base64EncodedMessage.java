package com.podlasenko.example.model;

import lombok.RequiredArgsConstructor;

import java.util.Base64;

@RequiredArgsConstructor
public class Base64EncodedMessage implements Message {

	private final Message message;

	@Override
	public String getContent() {
		return Base64.getEncoder()
				.encodeToString(message.getContent().getBytes());
	}
}
