package com.podlasenko.example;

import com.podlasenko.example.model.Message;
import com.podlasenko.example.model.TextMessage;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

	}
}
