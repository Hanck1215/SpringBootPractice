package main.java;
import javax.swing.Spring;

import org.springframework.boot.SpringApplication ;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration ;
import org.springframework.web.bind.annotation.RestController ;
import org.springframework.web.bind.annotation.RequestMapping ;

@RestController
@EnableAutoConfiguration
public class Hello {
    @RequestMapping("/")
    String home() {
        return "Hello world!" ;
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Hello.class, args) ;
    }
}
