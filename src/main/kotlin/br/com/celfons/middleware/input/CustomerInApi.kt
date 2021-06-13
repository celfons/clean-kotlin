package br.com.celfons.middleware.input

import br.com.celfons.domain.io.PortOut
import br.com.celfons.middleware.entity.Customer

interface CustomerInApi: PortOut<List<Customer>> {

    override fun execute(): List<Customer>

}
