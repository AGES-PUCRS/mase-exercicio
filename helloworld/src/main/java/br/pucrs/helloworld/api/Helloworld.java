package br.pucrs.helloworld.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;


@RestController
public class Helloworld {

    @GetMapping("/hello")
    public Mono<String> helloworld() {
        return Mono.just("Hello world");
    
    }
}