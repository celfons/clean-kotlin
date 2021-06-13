package br.com.celfons.middleware.output

import br.com.celfons.domain.io.PortInOut
import br.com.celfons.middleware.entity.Customer

interface CustomerOutApi: PortInOut<Customer, Customer> {

    override fun execute(customer: Customer): Customer

}
