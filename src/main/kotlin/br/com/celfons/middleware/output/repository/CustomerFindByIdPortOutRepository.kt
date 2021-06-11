package br.com.celfons.middleware.output.repository

import br.com.celfons.domain.io.PortOut
import br.com.celfons.middleware.entity.Customer
import java.util.UUID

interface CustomerFindByIdPortOutRepository: CustomerPortOutRepository, PortOut<UUID, Customer> {

    override fun execute(id : UUID): Customer

}
