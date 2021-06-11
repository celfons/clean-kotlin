package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.Port

class SaveCustomerUseCases(private val repository: Port<Customer, Customer>): CustomerUseCases() {

    override fun execute(customer: Customer): Customer {
        //TODO implements business rules
        return repository.execute(customer)
    }

}
