package com.example.springtask3v2.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PlainDummyLogger implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("Hello from plain Logger");
    }
}
