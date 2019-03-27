package br.pucrs.helloworld.api;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Helloworld {

    @GetMapping("/")
    public Mono<String> helloworld() {
        return Mono.just("Hello world");
    
    }
}