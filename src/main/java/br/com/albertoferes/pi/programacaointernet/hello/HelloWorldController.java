package br.com.albertoferes.pi.programacaointernet.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld(){
        return "<h1>Hello World a partir do Spring Boot!</h1>";
    }
}
