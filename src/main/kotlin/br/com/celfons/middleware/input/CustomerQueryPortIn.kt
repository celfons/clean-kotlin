package br.com.celfons.middleware.input

import br.com.celfons.domain.io.PortIn
import br.com.celfons.middleware.entity.Customer

interface CustomerQueryPortIn: PortIn<String, Customer> {

    override fun execute(customer: String): Customer

}
