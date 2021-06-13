package br.com.celfons.data.services

import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerSaveInApi
import br.com.celfons.middleware.input.usecases.CustomerUseCases.Companion.save
import br.com.celfons.middleware.output.repository.CustomerSaveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerSaveService(
    @Autowired private var repository: CustomerSaveRepository
): CustomerSaveInApi {

    override fun execute(customer: Customer): Customer = save(customer, repository)

}
