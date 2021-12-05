package com.rpanic

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.rpanic.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureMonitoring()
        configureSerialization()
    }.start(wait = true)
}
