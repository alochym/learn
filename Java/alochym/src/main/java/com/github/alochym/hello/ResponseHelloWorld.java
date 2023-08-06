package com.github.alochym.hello;

public class ResponseHelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseHelloWorld(String message) {
        this.message = message;
    }
}
