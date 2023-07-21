package com.example.secretmanagerandssmpoc.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/secret")
    suspend fun getScret(
        @Value("\${app-credentials.client-id}") clientId: String
    ): ResponseEntity<String> {
        return ResponseEntity.ok(clientId)
    }

    @GetMapping("/parameter")
    suspend fun getBaseUri(
        @Value("\${http.base-uri}") baseUri: String
    ): ResponseEntity<String> {
        return ResponseEntity.ok(baseUri)
    }
}