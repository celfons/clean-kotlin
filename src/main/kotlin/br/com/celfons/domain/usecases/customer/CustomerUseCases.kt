package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.usecases.UseCases

abstract class CustomerUseCases: UseCases<Customer> {

    abstract override fun execute(customer: Customer) : Customer

}
