package br.pucrs.HelloWorld.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Hello{
 
@GetMapping("/hello")
 public Mono<String> helloworld(){
     return Mono.just("Hello World!");
 }
}