package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.Query
import br.com.celfons.domain.usecases.QueryCases

class CustomerFindAllUseCases(private val repository: Query<List<Customer>>): QueryCases<List<Customer>> {

    override fun execute(): List<Customer> {
        //TODO implements business rules
        return repository.execute()
    }

}
