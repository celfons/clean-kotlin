package br.com.celfons.data.db.adapter

import br.com.celfons.data.db.CustomerRepository
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.repository.CustomerFindAllRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CustomerFindAllRepositoryAdapter(
    @Autowired private var repository: CustomerRepository
): CustomerFindAllRepository {

    override fun execute(): List<Customer> = repository.findAll()

}
