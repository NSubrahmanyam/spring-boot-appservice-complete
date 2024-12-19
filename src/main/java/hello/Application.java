package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/greetings")
    public String message() {
        return "Welcome to Application ! app deployed in AWS EKS";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
