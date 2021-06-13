package br.com.celfons.middleware.output.repository

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.PortIn

interface CustomerSaveRepository: CustomerOutRepository, PortIn<Customer> {

    override fun execute(customer : Customer): Customer

}