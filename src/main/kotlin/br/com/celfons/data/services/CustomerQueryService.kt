package br.com.celfons.data.services

import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerFindAllInApi
import br.com.celfons.middleware.input.usecases.CustomerUseCases.Companion.findAll
import br.com.celfons.middleware.output.repository.CustomerFindAllRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerQueryService(
    @Autowired private var repository: CustomerFindAllRepository
): CustomerFindAllInApi {

    override fun execute(): List<Customer> = findAll(repository)

}
