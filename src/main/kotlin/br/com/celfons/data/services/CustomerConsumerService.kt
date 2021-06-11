package br.com.celfons.data.services

import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerPortIn
import br.com.celfons.middleware.input.usecases.CustomerUseCases.Companion.handle
import br.com.celfons.middleware.output.CustomerPortOut
import br.com.celfons.middleware.output.repository.CustomerSavePortOutRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerConsumerUpdateService(
    @Autowired private var api: CustomerPortOut,
    @Autowired private var repository: CustomerSavePortOutRepository
): CustomerPortIn {

    override fun execute(customer: Customer): Customer = handle(customer, api, repository)

}
