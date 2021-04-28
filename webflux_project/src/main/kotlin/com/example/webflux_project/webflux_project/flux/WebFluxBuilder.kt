package com.example.webflux_project.webflux_project.flux

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class WebFluxBuilder {
    fun <T>monoSomething(something :T): Mono<T> = Mono.just(something)
}