package edu.tseidler.messenger.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MessageTest {
    @Test
    public void shouldCreateMessageWithRequiredFields() {
        final String subject = "subject";
        final String from = "from";
        final String to = "to";
        final String body = "body";

        Message message = new Message.MessageBuilder()
                .withSubject(subject)
                .withFrom(from)
                .withTo(to)
                .withBody(body)
                .build();

        Assert.assertEquals(subject, message.getSubject());
        Assert.assertEquals(from, message.getFrom());
        Assert.assertEquals(to, message.getTo());
        Assert.assertEquals(body, message.getBody());
    }
}
