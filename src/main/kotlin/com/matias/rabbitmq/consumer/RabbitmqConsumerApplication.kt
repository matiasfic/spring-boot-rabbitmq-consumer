package com.matias.rabbitmq.consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RabbitmqConsumerApplication

fun main(args: Array<String>) {
    runApplication<RabbitmqConsumerApplication>(*args)
}

