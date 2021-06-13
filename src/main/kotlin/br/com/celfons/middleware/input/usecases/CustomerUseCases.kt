package br.com.celfons.middleware.input.usecases

import br.com.celfons.domain.io.Command
import br.com.celfons.domain.io.Query
import br.com.celfons.domain.usecases.customer.CustomerFindAllUseCases
import br.com.celfons.domain.usecases.customer.CustomerSaveUseCases
import br.com.celfons.domain.usecases.customer.CustomerUpdateUseCases
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.CustomerOutApi
import br.com.celfons.middleware.output.repository.CustomerPortOutRepository
import br.com.celfons.domain.Customer as Entity

abstract class CustomerUseCases {

    companion object {

        fun handle(
            customer: Customer,
            api: CustomerOutApi,
            repository: CustomerPortOutRepository,
        ): Customer =
            run {
                handle(customer, api)
            }.also {
                handle(customer, repository)
            }

        fun handle(customer: Customer, api: CustomerOutApi): Customer {
            val usecase = CustomerUpdateUseCases(api as Command<Entity>)
            return usecase.execute(customer) as Customer
        }

        fun handle(customer: Customer, repository: CustomerPortOutRepository): Customer {
            val usecase = CustomerSaveUseCases(repository as Command<Entity>)
            return usecase.execute(customer) as Customer
        }

        fun handle(repository: CustomerPortOutRepository): List<Customer> {
            val usecase = CustomerFindAllUseCases(repository as Query<List<Entity>>)
            return usecase.execute() as List<Customer>
        }

    }

}
