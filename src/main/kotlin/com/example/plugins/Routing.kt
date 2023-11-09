package com.example.plugins

import com.example.routes.randomTeam
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
      randomTeam()
        static {
            resources("static")
        }
    }
}
