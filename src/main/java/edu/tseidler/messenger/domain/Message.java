package edu.tseidler.messenger.domain;

public class Message {
    private final String subject;
    private final String from;
    private final String to;
    private final String body;

    public Message(MessageBuilder messageBuilder) {
        subject = messageBuilder.subject;
        from = messageBuilder.from;
        to = messageBuilder.to;
        body = messageBuilder.body;
    }

    public String getSubject() {
        return subject;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }

    public static class MessageBuilder {
        private String subject;
        private String from;
        private String to;
        private String body;

        public MessageBuilder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public MessageBuilder withFrom(String from) {
            this.from = from;
            return this;
        }

        public MessageBuilder withTo(String to) {
            this.to = to;
            return this;
        }

        public MessageBuilder withBody(String body) {
            this.body = body;
            return this;
        }

        public Message build() {
            return new Message(this);
        }

    }
}
