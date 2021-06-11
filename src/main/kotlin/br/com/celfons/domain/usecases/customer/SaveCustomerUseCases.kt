package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.Port
import br.com.celfons.domain.usecases.UseCases

class SaveCustomerUseCases(private val repository: Port<Customer, Customer>): UseCases<Customer, Customer> {

    override fun execute(customer: Customer): Customer {
        //TODO implements business rules
        return repository.execute(customer)
    }

}
