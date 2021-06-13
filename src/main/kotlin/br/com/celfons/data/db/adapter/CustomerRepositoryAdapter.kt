package br.com.celfons.data.db.adapter

import br.com.celfons.data.db.CustomerRepository
import br.com.celfons.data.db.dto.CustomerDTO
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.repository.CustomerFindAllRepository
import br.com.celfons.middleware.output.repository.CustomerSaveRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

abstract class CustomerRepositoryAdapter

@Component
class CustomerFindAllRepositoryAdapter(
    @Autowired private var repository: CustomerRepository
): CustomerRepositoryAdapter(), CustomerFindAllRepository {

    override fun execute(): List<Customer> = repository.findAll()

}

@Component
class CustomerSaveRepositoryAdapter(
    @Autowired private var repository: CustomerRepository
): CustomerRepositoryAdapter(), CustomerSaveRepository {

    override fun execute(customer: Customer): Customer =
        repository.save(customer as CustomerDTO)

}
