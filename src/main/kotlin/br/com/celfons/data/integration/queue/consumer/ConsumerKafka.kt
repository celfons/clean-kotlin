package br.com.celfons.data.integration.queue.consumer

import br.com.celfons.data.integration.queue.adapter.CustomerConsumerAdapter
import br.com.celfons.data.integration.queue.payload.CustomerPayload
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ConsumerKafka(
    @Autowired private var customerConsumerAdapter: CustomerConsumerAdapter
){

    @KafkaListener(
        topics = ["\${topic.customer.update}"],
        groupId = "\${spring.kafka.consumer.group-id}"
    )
    fun listen(consumerRecord: ConsumerRecord<String?, CustomerPayload?>) {
        val customer = consumerRecord.value()
        customerConsumerAdapter.consume(customer!!)
    }

}
