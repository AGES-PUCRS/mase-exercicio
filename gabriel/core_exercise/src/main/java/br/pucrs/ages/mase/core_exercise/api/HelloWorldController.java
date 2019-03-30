package br.pucrs.ages.mase.core_exercise.api;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import reactor.core.publisher.Mono;

@Controller

public class HelloWorldController{
    @GetMapping("/")
    @ResponseBody
    public Publisher<String> handler(){
        return Mono.just("Hello World!");
    }
}