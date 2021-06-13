package br.com.celfons.middleware.input

import br.com.celfons.domain.io.PortInOut
import br.com.celfons.middleware.entity.Customer

interface CustomerInConsumer: PortInOut<Customer, Customer> {

    override fun execute(customer: Customer): Customer

}
