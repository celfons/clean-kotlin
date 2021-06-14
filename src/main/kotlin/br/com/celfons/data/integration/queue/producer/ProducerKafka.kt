package br.com.celfons.data.integration.queue.producer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class ProducerKafka(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    fun send(topic: String, message: String) {
        kafkaTemplate.send(topic, message)
    }

}
