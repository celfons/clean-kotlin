package br.com.celfons.middleware.output.repository

import br.com.celfons.domain.io.PortOut
import br.com.celfons.middleware.entity.Customer

interface CustomerFindAllRepository: CustomerOutRepository, PortOut<List<Customer>> {

    override fun execute(): List<Customer>

}
