package tech.pdai.hello.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pdai
 */
@SpringBootApplication
@RestController
public class HelloApplication {

    /**
     * main interface.
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }


}
