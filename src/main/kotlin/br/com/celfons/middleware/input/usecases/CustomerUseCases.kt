package br.com.celfons.middleware.input.usecases

import br.com.celfons.domain.io.Port
import br.com.celfons.domain.usecases.customer.FindByIdCustomerUseCases
import br.com.celfons.domain.usecases.customer.SaveCustomerUseCases
import br.com.celfons.domain.usecases.customer.UpdateCustomerUseCases
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.CustomerPortOut
import br.com.celfons.middleware.output.repository.CustomerPortOutRepository
import br.com.celfons.domain.Customer as Domain
import java.util.UUID

abstract class CustomerUseCases {

    companion object {

        fun handle(
            customer: Customer,
            api: CustomerPortOut,
            repository: CustomerPortOutRepository,
        ): Customer =
            run {
                handle(customer, api)
            }.also {
                handle(customer, repository)
            }

        fun handle(customer: Customer, api: CustomerPortOut): Customer {
            val usecase = UpdateCustomerUseCases(api as Port<Domain, Domain>)
            return usecase.execute(customer) as Customer
        }

        fun handle(customer: Customer, portOutRepository: CustomerPortOutRepository): Customer {
            val usecase = SaveCustomerUseCases(portOutRepository as Port<Domain, Domain>)
            return usecase.execute(customer) as Customer
        }

        fun handle(id: UUID, portOutRepository: CustomerPortOutRepository): Customer {
            val usecase = FindByIdCustomerUseCases(portOutRepository as Port<UUID, Domain>)
            return usecase.execute(id) as Customer
        }

    }

}
