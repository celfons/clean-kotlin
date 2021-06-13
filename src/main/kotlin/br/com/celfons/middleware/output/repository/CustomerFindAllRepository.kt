package br.com.celfons.middleware.output.repository

import br.com.celfons.domain.io.Query
import br.com.celfons.middleware.entity.Customer

interface CustomerFindAllRepository: CustomerPortOutRepository, Query<List<Customer>> {

    override fun execute(): List<Customer>

}
