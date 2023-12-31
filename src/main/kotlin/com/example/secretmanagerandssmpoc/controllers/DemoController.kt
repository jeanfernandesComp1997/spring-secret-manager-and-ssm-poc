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
            val client_id = clientId
            val client_secret = clientSecret
        })
    }

    @GetMapping("/parameter")
    suspend fun getBaseUri(
        @Value("\${http.base-uri}") baseUri: String,
        @Value("\${http.api-gateway-id}") gatewayId: String
    ): ResponseEntity<Any> {
        return ResponseEntity.ok(object {
            val base_uri = baseUri
            val gateway_id = gatewayId
        })
    }
}