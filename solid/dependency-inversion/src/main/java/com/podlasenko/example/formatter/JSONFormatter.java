package com.podlasenko.example.formatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.podlasenko.example.exception.FormatException;
import com.podlasenko.example.model.Message;

public class JSONFormatter implements Formatter {

    public String format(Message message) throws FormatException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

		try {
			return mapper.writeValueAsString(message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new FormatException(e);
		}
	}
}
