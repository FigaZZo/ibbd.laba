package com.ibbd.laba

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/")
class HtmlController {

    @GetMapping("/")
    fun blog(): String {
        logger.debug{ "Hey" }
        return "blog"
    }

}