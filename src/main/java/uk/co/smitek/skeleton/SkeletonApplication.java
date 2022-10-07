package uk.co.smitek.skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SkeletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkeletonApplication.class, args);
    }

    @Controller
    public static class HelloWorldController {

        @GetMapping("/")
        public String helloWorld() {
            return "hello-world";
        }

    }

}
