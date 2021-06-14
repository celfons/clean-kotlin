package br.com.celfons.data.integration.queue.adapter

import br.com.celfons.data.integration.queue.producer.ProducerKafka
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.CustomerOutError
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class CustomerProducerAdapter(
    @Autowired private var producer: ProducerKafka,
    @Value("topic.error") private val topic: String
): CustomerOutError {

    override fun execute(customer: Customer): Customer = customer.apply {
        val payload = ObjectMapper().writeValueAsString(customer)
        producer.send(topic, payload)
    }

}
