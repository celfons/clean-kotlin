package br.com.celfons.middleware.input.usecases

import br.com.celfons.domain.io.PortInOut
import br.com.celfons.domain.io.PortOut
import br.com.celfons.domain.usecases.customer.CustomerFindAllUseCases
import br.com.celfons.domain.usecases.customer.CustomerSaveUseCases
import br.com.celfons.domain.usecases.customer.CustomerUpdateUseCases
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.CustomerOutApi
import br.com.celfons.middleware.output.repository.CustomerOutRepository
import br.com.celfons.domain.Customer as Domain

abstract class CustomerUseCases {

    companion object {

        fun handle(
            customer: Customer,
            api: CustomerOutApi,
            repository: CustomerOutRepository,
        ): Customer =
            run {
                handle(customer, api)
            }.also {
                handle(customer, repository)
            }

        fun handle(customer: Customer, api: CustomerOutApi): Customer {
            val usecase = CustomerUpdateUseCases(api as PortInOut<Domain, Domain>)
            return usecase.execute(customer) as Customer
        }

        fun handle(customer: Customer, repository: CustomerOutRepository): Customer {
            val usecase = CustomerSaveUseCases(repository as PortInOut<Domain, Domain>)
            return usecase.execute(customer) as Customer
        }

        fun handle(repository: CustomerOutRepository): List<Customer> {
            val usecase = CustomerFindAllUseCases(repository as PortOut<List<Domain>>)
            return usecase.execute() as List<Customer>
        }

    }

}
