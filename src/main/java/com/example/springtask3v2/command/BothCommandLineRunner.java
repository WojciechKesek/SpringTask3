package com.example.springtask3v2.command;

import com.example.springtask3v2.model.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BothCommandLineRunner implements CommandLineRunner {

    private final List<DummyLogger> loggers;

    @Override
    public void run(String... args) throws Exception {
        loggers.forEach(DummyLogger::sayHello);
    }
}
