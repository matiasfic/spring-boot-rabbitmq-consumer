package com.matias.rabbitmq.consumer.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConsumerConfig {
    @Bean
    fun messageConverter(): Jackson2JsonMessageConverter =
        Jackson2JsonMessageConverter(ObjectMapper().registerModule(KotlinModule()))
}