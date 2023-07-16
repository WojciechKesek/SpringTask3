package com.example.springtask3v2.command;

import com.example.springtask3v2.model.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PlainCommandLineRunner implements CommandLineRunner {

    @Autowired
    @Qualifier("plainDummyLogger")
    private DummyLogger dummyLogger;
    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
