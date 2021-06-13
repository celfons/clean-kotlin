package br.com.celfons.data.db.adapter

import br.com.celfons.data.db.CustomerRepository
import br.com.celfons.data.db.dto.CustomerDTO
import br.com.celfons.domain.Customer
import br.com.celfons.middleware.output.repository.CustomerSaveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CustomerSaveRepositoryAdapter(
    @Autowired private var repository: CustomerRepository
): CustomerSaveRepository {

    override fun execute(customer: Customer): Customer =
        repository.save(customer as CustomerDTO)

}
