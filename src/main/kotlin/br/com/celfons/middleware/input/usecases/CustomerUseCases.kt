package br.com.celfons.middleware.input.usecases

import br.com.celfons.domain.Command
import br.com.celfons.domain.Query
import br.com.celfons.domain.usecases.CustomerFindAllUseCases
import br.com.celfons.domain.usecases.CustomerSaveUseCases
import br.com.celfons.domain.usecases.CustomerUpdateUseCases
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.CustomerOutApi
import br.com.celfons.middleware.output.CustomerOutError
import br.com.celfons.middleware.output.repository.CustomerOutputRepository
import br.com.celfons.domain.Customer as Entity

abstract class CustomerUseCases {

    companion object {

        fun update(
            customer: Customer,
            api: CustomerOutApi,
            repository: CustomerOutputRepository,
            error: CustomerOutError
        ): Customer {
            val usecase = CustomerUpdateUseCases(api as Command<Entity>, repository as Command<Entity>, error  as Command<Entity>)
            return usecase.execute(customer) as Customer
        }

        fun findAll(repository: CustomerOutputRepository): List<Customer> {
            val usecase = CustomerFindAllUseCases(repository as Query<List<Entity>>)
            return usecase.execute() as List<Customer>
        }

        fun save(customer: Customer, repository: CustomerOutputRepository,
                 error: CustomerOutError): Customer {
            val usecase = CustomerSaveUseCases(repository as Command<Entity>, error  as Command<Entity> )
            return usecase.execute(customer) as Customer
        }

    }

}
