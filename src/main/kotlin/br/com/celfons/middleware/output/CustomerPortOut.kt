package br.com.celfons.middleware.output

import br.com.celfons.domain.io.PortOut
import br.com.celfons.middleware.entity.Customer

interface CustomerPortOut: PortOut<Customer, Customer> {

    override fun execute(customer: Customer): Customer

}
