package com.example.learningKotlin

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/"])
class Controller(private val service: Service) {

    @PostMapping("/geradorModel", consumes = [MediaType.TEXT_PLAIN_VALUE])
    fun gerarModel(@RequestBody entrada: String): ResponseEntity<String> {
        return ResponseEntity(service.gerarModel(entrada), HttpStatus.OK)
    }

    @PostMapping("/gerenciadorRotas", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun gerenciarRotas(@RequestBody rotas: Rotas): ResponseEntity<Boolean> {
        return ResponseEntity(service.gerenciarRotas(rotas), HttpStatus.OK)
    }
}
