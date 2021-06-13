package br.com.celfons.data.services

import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerInConsumer
import br.com.celfons.middleware.input.usecases.CustomerUseCases.Companion.update
import br.com.celfons.middleware.output.CustomerOutApi
import br.com.celfons.middleware.output.repository.CustomerSaveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerConsumerUpdateService(
    @Autowired private var api: CustomerOutApi,
    @Autowired private var repository: CustomerSaveRepository
): CustomerInConsumer {

    override fun execute(customer: Customer): Customer = update(customer, api, repository)

}
