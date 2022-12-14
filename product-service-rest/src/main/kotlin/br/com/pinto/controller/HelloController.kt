package br.com.pinto.controller

import com.google.gson.Gson
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/hello")
class HelloController {

    @Get
    fun hello(): HttpResponse<String> {

        var res = "Marcelo"

        for (i in 1..10) {
            res += res
        }

        return HttpResponse.created(res)
    }

/*
    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    fun hello(@Body content: String) : String {

        var result = content

        for (i in 1..10) {
            result += result
        }

        return result
    }
*/

}
