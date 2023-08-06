package com.github.alochym.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld
 */
// REST API Controller.
@RestController
public class HelloWorld {

    // Request /hello with GET method.
    @GetMapping("/hello")
    public String Hello() {
        return "Hello World REST API";
    }

    // Request /hello-json with GET method.
    @GetMapping("/hello-json")
    public ResponseEntity<ResponseHelloWorld> HelloJson() {
        ResponseHelloWorld msg = new ResponseHelloWorld("Hello World REST API");
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}