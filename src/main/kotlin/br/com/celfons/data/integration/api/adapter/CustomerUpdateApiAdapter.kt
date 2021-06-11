package br.com.celfons.data.integration.api.adapter

import br.com.celfons.data.integration.api.client.CustomerApiRw
import br.com.celfons.data.integration.api.client.request.CustomerRequest
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.CustomerPortOut
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CustomerUpdateApiAdapter(
    @Autowired private var customerApiRw: CustomerApiRw
): CustomerPortOut {

    override fun execute(customer: Customer): Customer {
        val request = CustomerRequest(customer.name!!)
        customerApiRw.update(request)
        return customer
    }

}
