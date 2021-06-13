package br.com.celfons.domain.usecases.customer

import br.com.celfons.domain.Customer
import br.com.celfons.domain.io.PortOut
import br.com.celfons.domain.usecases.UseCasesOut

class CustomerFindAllUseCases(private val repository: PortOut<List<Customer>>): UseCasesOut<List<Customer>> {

    override fun execute(): List<Customer> {
        //TODO implements business rules
        return repository.execute()
    }

}
