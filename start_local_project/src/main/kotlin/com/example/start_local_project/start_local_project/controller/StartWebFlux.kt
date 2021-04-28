package com.example.start_local_project.start_local_project.controller

import com.example.webflux_project.webflux_project.flux.WebFluxBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/")
class Controller(@Autowired var fluxBuilder: WebFluxBuilder) {

    @GetMapping("/get")
    fun get(): Mono<String> = fluxBuilder.monoSomething("Start_Local_Project")
}