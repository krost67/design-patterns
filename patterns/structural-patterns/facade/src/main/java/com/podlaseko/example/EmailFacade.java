package com.podlaseko.example;

import com.podlaseko.example.email.Email;
import com.podlaseko.example.email.Mailer;
import com.podlaseko.example.email.Stationary;
import com.podlaseko.example.email.StationaryFactory;
import com.podlaseko.example.email.Template;
import com.podlaseko.example.email.TemplateFactory;

public class EmailFacade {

    public boolean sendOrderEmail(Order order) {
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();

        return mailer.send(email);
    }
}
