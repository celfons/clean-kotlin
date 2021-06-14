package br.com.celfons.middleware.output

import br.com.celfons.domain.Command
import br.com.celfons.middleware.entity.Customer

interface CustomerOutput

interface CustomerOutApi: CustomerOutput, Command<Customer> {

    override fun execute(customer: Customer): Customer

}

interface CustomerOutError: CustomerOutput, Command<Customer> {

    override fun execute(customer: Customer): Customer

}
