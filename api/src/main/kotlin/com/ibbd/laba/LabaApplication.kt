package com.ibbd.laba

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class LabaApplication

fun main(args: Array<String>) {
    runApplication<LabaApplication>(*args)
    logger.debug { "Hey" }
}
