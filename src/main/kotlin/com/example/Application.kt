package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
fun main() {
    embeddedServer(Netty, port = 8080, host = "192.168.1.34", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
//    routing {
//        swaggerUI(path = "swagger", swaggerFile = "openapi/documentation.yaml")
//    }
//    install(CORS) {
//        allowMethod(HttpMethod.Options)
//        allowMethod(HttpMethod.Put)
//        allowMethod(HttpMethod.Delete)
//        allowMethod(HttpMethod.Patch)
//        allowHeader(HttpHeaders.Authorization)
//        allowHeader("MyCustomHeader")
//        anyHost()
//    }
//    routing {
//        openAPI(path = "openapi", swaggerFile = "openapi/documentation.yaml"){
//        }
//    }
}
