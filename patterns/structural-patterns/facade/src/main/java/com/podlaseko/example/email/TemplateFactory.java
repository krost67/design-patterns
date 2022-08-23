package com.podlaseko.example.email;

public class TemplateFactory {

	public static Template createTemplateFor(Template.TemplateType type) {
		if (type == Template.TemplateType.Email) {
			return new OrderEmailTemplate();
		}
		throw new IllegalArgumentException("Unknown TemplateType");
	}
}
