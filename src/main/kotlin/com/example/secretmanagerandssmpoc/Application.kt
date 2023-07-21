package com.example.secretmanagerandssmpoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@RefreshScope
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
