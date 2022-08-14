package com.podlasenko.example.model;

import lombok.RequiredArgsConstructor;
import org.apache.commons.text.StringEscapeUtils;

@RequiredArgsConstructor
public class HtmlEncodedMessage implements Message {

    private final Message message;

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }
}
