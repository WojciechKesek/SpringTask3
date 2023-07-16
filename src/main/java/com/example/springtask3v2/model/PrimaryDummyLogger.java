package com.example.springtask3v2.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Slf4j
@Primary
@Component
public class PrimaryDummyLogger implements DummyLogger{
    @Override
    public void sayHello() {
        log.info("Hello from main Logger");
    }
}
