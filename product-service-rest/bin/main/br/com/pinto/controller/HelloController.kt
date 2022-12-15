package br.com.pinto.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/hello")
class HelloController {

    @Post
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    fun hello(content: String): HttpResponse<String> {
        return HttpResponse.created(content.toString())
    }
}
