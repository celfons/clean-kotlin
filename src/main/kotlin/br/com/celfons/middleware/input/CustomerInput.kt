package br.com.celfons.middleware.input

import br.com.celfons.domain.Command
import br.com.celfons.domain.Query
import br.com.celfons.middleware.entity.Customer

interface CustomerInput

interface CustomerSaveInApi: CustomerInput, Command<Customer> {

    override fun execute(customer: Customer): Customer

}

interface CustomerInConsumer: CustomerInput, Command<Customer> {

    override fun execute(customer: Customer): Customer

}

interface CustomerFindAllInApi: CustomerInput, Query<List<Customer>> {

    override fun execute(): List<Customer>

}
