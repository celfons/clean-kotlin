package br.com.celfons.data.services

import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerFindAllInApi
import br.com.celfons.middleware.input.CustomerInConsumer
import br.com.celfons.middleware.input.CustomerSaveInApi
import br.com.celfons.middleware.input.usecases.CustomerUseCases
import br.com.celfons.middleware.output.CustomerOutApi
import br.com.celfons.middleware.output.repository.CustomerFindAllRepository
import br.com.celfons.middleware.output.repository.CustomerSaveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

abstract class CustomerService

@Service
class CustomerSaveService(
    @Autowired private var repository: CustomerSaveRepository
): CustomerService(), CustomerSaveInApi {

    override fun execute(customer: Customer): Customer = CustomerUseCases.save(customer, repository)

}

@Service
class CustomerQueryService(
    @Autowired private var repository: CustomerFindAllRepository
): CustomerService(), CustomerFindAllInApi {

    override fun execute(): List<Customer> = CustomerUseCases.findAll(repository)

}

@Service
class CustomerConsumerUpdateService(
    @Autowired private var api: CustomerOutApi,
    @Autowired private var repository: CustomerSaveRepository
): CustomerService(), CustomerInConsumer {

    override fun execute(customer: Customer): Customer = CustomerUseCases.update(customer, api, repository)

}
