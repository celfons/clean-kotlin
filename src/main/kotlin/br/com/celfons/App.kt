package br.com.celfons

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class App

fun main(args: Array<String>) {
    runApplication<App>(*args)
}
