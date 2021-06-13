package br.com.celfons.middleware.output

import br.com.celfons.domain.io.Command
import br.com.celfons.middleware.entity.Customer

interface CustomerOutApi: Command<Customer> {

    override fun execute(customer: Customer): Customer

}
