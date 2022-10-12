package com.example.demo.controller;

import com.example.demo.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(path="/hello")
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format(template, name);
    }

    @GetMapping("/greeting")
    public HelloWorldService greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new HelloWorldService(counter.incrementAndGet(), String.format(template, name));
    }

}
