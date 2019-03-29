package br.pucrs.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public Mono<String> helloworld() {
        return Mono.just("Hello world");
    
    }
}