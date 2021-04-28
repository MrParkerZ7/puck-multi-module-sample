package com.example.main_project.main_project.controller

import com.example.utils_project.utils_project.model.UtilsProject
import com.example.webflux_project.webflux_project.flux.WebFluxBuilder
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class DoThing (var fluxBuilder: WebFluxBuilder) {

    fun doIt() {
        println("Do It : XXX")
        UtilsProject()
    }

    fun getMono(): Mono<String> =fluxBuilder.monoSomething("Somthing")
}