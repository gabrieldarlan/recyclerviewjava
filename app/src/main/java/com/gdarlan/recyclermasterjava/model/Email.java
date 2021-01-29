package com.gdarlan.recyclermasterjava.model;

public class Email {
    private String user;
    private String subject;
    private String preview;
    private String date;
    private boolean stared;
    private boolean unread;
    private boolean select;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStared() {
        return stared;
    }

    public void setStared(boolean stared) {
        this.stared = stared;
    }

    public boolean isUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public static class EmailBuilder {
        private String user;
        private String subject;
        private String preview;
        private String date;
        private boolean stared;
        private boolean unread;
        private boolean select;

        public EmailBuilder setUser(String user) {
            this.user = user;
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder setPreview(String preview) {
            this.preview = preview;
            return this;
        }

        public EmailBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public EmailBuilder setStared(boolean stared) {
            this.stared = stared;
            return this;
        }

        public EmailBuilder setUnread(boolean unread) {
            this.unread = unread;
            return this;
        }

        public EmailBuilder setSelect(boolean select) {
            this.select = select;
            return this;
        }

        private EmailBuilder() {
        }

        public static EmailBuilder builder() {
            return new EmailBuilder();
        }

        public Email build() {
            Email email = new Email();
            email.user = user;
            email.subject = subject;
            email.preview = preview;
            email.date = date;
            email.select = select;
            email.stared = stared;
            email.unread = unread;

            return email;
        }

    }


}
