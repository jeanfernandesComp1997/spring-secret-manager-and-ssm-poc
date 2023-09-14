package com.example.secretmanagerandssmpoc.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/secret")
    suspend fun getSecret(
        @Value("\${app-credentials.client-id}") clientId: String,
        @Value("\${app-credentials.client-secret}") clientSecret: String
    ): ResponseEntity<Any> {
        return ResponseEntity.ok(object {
            val clientId = clientId
            val clientSecret = clientSecret
        })
    }

    @GetMapping("/parameter")
    suspend fun getBaseUri(
        @Value("\${http.base-uri}") baseUri: String
    ): ResponseEntity<String> {
        return ResponseEntity.ok(baseUri)
    }
}