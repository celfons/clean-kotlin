package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.Command
import br.com.celfons.domain.usecases.CommandCases

class CustomerUpdateUseCases(private val api: Command<Customer>): CommandCases<Customer> {

    override fun execute(customer: Customer): Customer {
        //TODO implements business rules
        return api.execute(customer)
    }

}
