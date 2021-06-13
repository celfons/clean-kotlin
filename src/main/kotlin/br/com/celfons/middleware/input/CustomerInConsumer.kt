package br.com.celfons.middleware.input

import br.com.celfons.domain.io.Command
import br.com.celfons.middleware.entity.Customer

interface CustomerInConsumer: Command<Customer> {

    override fun execute(customer: Customer): Customer

}
