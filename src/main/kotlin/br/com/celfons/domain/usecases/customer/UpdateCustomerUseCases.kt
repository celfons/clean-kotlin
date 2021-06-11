package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.Port

class UpdateCustomerUseCases(private val api: Port<Customer, Customer>): CustomerUseCases() {

    override fun execute(customer: Customer): Customer {
        //TODO implements business rules
        return api.execute(customer)
    }

}
