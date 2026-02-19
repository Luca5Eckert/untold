package br.com.untold.module.todo.domain.model;

public class Todo {

    private long id;

    private String title;

    private String description;

    private Status status;

    public Todo(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.status = builder.status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static class Builder {
        private long id;
        private final String title;
        private String description;
        private Status status;

        public Builder(String title) {
            this.title = title;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Todo build() {
            return new Todo(this);
        }
    }

}
