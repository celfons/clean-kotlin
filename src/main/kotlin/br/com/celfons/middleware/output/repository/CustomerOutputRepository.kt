package br.com.celfons.middleware.output.repository

import br.com.celfons.domain.Command
import br.com.celfons.domain.Query
import br.com.celfons.middleware.entity.Customer

interface CustomerOutputRepository

interface CustomerFindAllRepository: CustomerOutputRepository, Query<List<Customer>> {

    override fun execute(): List<Customer>

}

interface CustomerSaveRepository: CustomerOutputRepository, Command<Customer> {

    override fun execute(customer : Customer): Customer

}
