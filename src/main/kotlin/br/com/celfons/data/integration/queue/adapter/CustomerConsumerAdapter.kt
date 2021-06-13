package br.com.celfons.data.integration.queue.adapter

import br.com.celfons.data.db.dto.CustomerDTO
import br.com.celfons.data.integration.queue.payload.CustomerPayload
import br.com.celfons.middleware.input.CustomerInConsumer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CustomerConsumerAdapter(
    @Autowired private var update: CustomerInConsumer
) {

    fun consume(payload: CustomerPayload) {
        update.execute(CustomerDTO(name = payload.name))
    }

}
