package br.com.celfons.middleware.output.repository

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.Command

interface CustomerSaveRepository: CustomerPortOutRepository, Command<Customer> {

    override fun execute(customer : Customer): Customer

}
