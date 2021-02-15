package com.matias.rabbitmq.producer.dto

import java.math.BigDecimal
import java.util.*

data class Order(
    val id: String,
    val customer: String,
    val price: BigDecimal,
    val status: OrderStatus
)

enum class OrderStatus {
    PENDING, DONE, CANCELLED
}