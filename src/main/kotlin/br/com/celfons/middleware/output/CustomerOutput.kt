package br.com.celfons.middleware.output

import br.com.celfons.domain.Command
import br.com.celfons.middleware.entity.Customer

interface CustomerOutput

interface CustomerOutApi: Command<Customer> {

    override fun execute(customer: Customer): Customer

}
