package com.example.springtask3v2.command;

import com.example.springtask3v2.model.DummyLogger;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrimayCommandLineRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;
    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
