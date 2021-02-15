package com.matias.rabbitmq.consumer.service

import com.matias.rabbitmq.producer.dto.Order
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

private const val QUEUE = "example-queue"

@Service
class OrderListener {

    private val logger = LoggerFactory.getLogger(javaClass)

    @RabbitListener(queues = [QUEUE])
    fun listen(order: Order) {
        logger.info("Order received: $order")
    }
}