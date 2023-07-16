package com.example.springtask3v2.command;

import com.example.springtask3v2.model.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PlainCommandLineRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    public PlainCommandLineRunner(@Qualifier("plainDummyLogger")DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }


    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
