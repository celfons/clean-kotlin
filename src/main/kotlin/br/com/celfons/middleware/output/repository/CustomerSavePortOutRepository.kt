package br.com.celfons.middleware.output.repository

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.PortOut

interface CustomerSavePortOutRepository: CustomerPortOutRepository, PortOut<Customer, Customer> {

    override fun execute(customer : Customer): Customer

}