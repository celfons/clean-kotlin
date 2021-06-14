package br.com.celfons.domain.usecases

import br.com.celfons.domain.Command
import br.com.celfons.domain.Customer
import br.com.celfons.domain.Query

abstract class CustomerUseCases

class CustomerFindAllUseCases(private val repository: Query<List<Customer>>): CustomerUseCases(), QueryCases<List<Customer>> {

    override fun execute(): List<Customer> {
        //TODO implements business rules
        return repository.execute()
    }

}

class CustomerSaveUseCases(
    private val repository: Command<Customer>,
    private val error: Command<Customer>
): CustomerUseCases(), CommandCases<Customer> {

    override fun execute(customer: Customer): Customer = //TODO implements business rules
        try {
            repository.execute(customer)
        } catch (e: Exception) {
            error.execute(customer.apply { error = e.message })
        }
}

class CustomerUpdateUseCases(
    private val api: Command<Customer>,
    private val repository: Command<Customer>,
    private val error: Command<Customer>
): CustomerUseCases(), CommandCases<Customer> {

    override fun execute(customer: Customer): Customer = //TODO implements business rules
        try {
            customer.run {
                api.execute(customer)
            }.also {
                repository.execute(it)
            }
        } catch (e: Exception) {
            error.execute(customer.apply { error = e.message })
        }

}
