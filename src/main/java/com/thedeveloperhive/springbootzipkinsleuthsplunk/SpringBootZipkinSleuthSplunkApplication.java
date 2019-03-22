package com.thedeveloperhive.springbootzipkinsleuthsplunk;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Slf4j
@RestController
@SpringBootApplication
public class SpringBootZipkinSleuthSplunkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootZipkinSleuthSplunkApplication.class, args);
    }

    @GetMapping
    public String helloWorld() {
        log.info("Hello World Endpoint");

        return "Hello World!";
    }

}
