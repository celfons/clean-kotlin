package br.com.celfons.middleware.input

import br.com.celfons.domain.io.PortIn
import br.com.celfons.middleware.entity.Customer

interface CustomerPortIn: PortIn<Customer, Customer> {

    override fun execute(customer: Customer): Customer

}
