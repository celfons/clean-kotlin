package br.com.celfons.data.services

import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerQueryPortIn
import br.com.celfons.middleware.input.usecases.CustomerUseCases.Companion.handle
import br.com.celfons.middleware.output.repository.CustomerFindByIdPortOutRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerQueryService(
    @Autowired private var repository: CustomerFindByIdPortOutRepository
): CustomerQueryPortIn {

    override fun execute(id: String): Customer = handle(UUID.fromString(id), repository)

}
