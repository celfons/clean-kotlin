package br.com.celfons.middleware.input

import br.com.celfons.domain.io.Query
import br.com.celfons.middleware.entity.Customer

interface CustomerInApi: Query<List<Customer>> {

    override fun execute(): List<Customer>

}
