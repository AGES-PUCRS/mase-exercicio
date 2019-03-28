package br.pucrs.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class helloworld{
 
@GetMapping("/hello")
 public Mono<String> HelloWorld(){
     return Mono.just("Hello World!");
 }
}