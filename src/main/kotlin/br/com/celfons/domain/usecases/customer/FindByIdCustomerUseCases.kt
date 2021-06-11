package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.Port
import br.com.celfons.domain.usecases.UseCases
import java.util.UUID

class FindByIdCustomerUseCases(private val repository: Port<UUID, Customer>): UseCases<UUID, Customer> {

    override fun execute(id: UUID): Customer {
        //TODO implements business rules
        return repository.execute(id)
    }

}
