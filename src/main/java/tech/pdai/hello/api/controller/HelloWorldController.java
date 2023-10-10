package tech.pdai.hello.api.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pdai
 */
@RestController
public class HelloWorldController {

    /**
     * hello world.
     *
     * @return hello
     */
    @GetMapping("/hello")
    public ResponseEntity<String> hello(@RequestParam String name) {
        return new ResponseEntity<>(String.join("hello ", name), HttpStatus.OK);
    }

}
