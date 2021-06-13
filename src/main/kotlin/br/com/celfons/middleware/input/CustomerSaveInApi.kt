package br.com.celfons.middleware.input

import br.com.celfons.domain.io.Command
import br.com.celfons.middleware.entity.Customer

interface CustomerSaveInApi: Command<Customer> {

    override fun execute(customer: Customer): Customer

}
