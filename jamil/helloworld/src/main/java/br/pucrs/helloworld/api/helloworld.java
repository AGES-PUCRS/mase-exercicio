package br.pucrs.helloworld.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class helloworld{
 
@GetMapping("/")
 public Mono<String> ping(){
     return Mono.just("Hello World");
 }
}