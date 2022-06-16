package uk.co.smitek.neosearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class NeoSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeoSearchApplication.class, args);
    }

    @Controller
    public static class HelloWorldController {

        @GetMapping("/")
        public String helloWorld() {
            return "hello-world";
        }

    }

}
