package com.example.main_project.main_project.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/")
class Controller(@Autowired var doThing: DoThing) {

    @GetMapping("/get")
    fun get(): Mono<String> = doThing.getMono()


}