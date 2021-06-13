package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.PortInOut
import br.com.celfons.domain.usecases.UseCasesInOut

class CustomerSaveUseCases(private val repository: PortInOut<Customer, Customer>): UseCasesInOut<Customer, Customer> {

    override fun execute(customer: Customer): Customer {
        //TODO implements business rules
        return repository.execute(customer)
    }

}