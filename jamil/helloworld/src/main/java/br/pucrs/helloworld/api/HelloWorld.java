package br.pucrs.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloWorld{
 
@GetMapping("/hello")
 public Mono<String> helloworld(){
     return Mono.just("Hello World!");
 }
}