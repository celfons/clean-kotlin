package br.com.celfons.data.integration.api.adapter

import br.com.celfons.data.integration.api.client.CustomerApiRw
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.CustomerOutApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CustomerApiAdapter(
    @Autowired private var customerApiRw: CustomerApiRw
): CustomerOutApi {

    override fun execute(customer: Customer): Customer {
        customerApiRw.update()
        return customer
    }

}
