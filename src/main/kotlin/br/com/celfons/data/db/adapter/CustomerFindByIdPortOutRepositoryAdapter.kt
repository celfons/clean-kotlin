package br.com.celfons.data.db.adapter

import br.com.celfons.data.db.CustomerRepository
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.output.repository.CustomerFindByIdPortOutRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class CustomerFindByIdPortOutRepositoryAdapter(
    @Autowired private var repository: CustomerRepository
): CustomerFindByIdPortOutRepository {

    override fun execute(id: UUID): Customer =
        repository.findById(id).orElseThrow()

}
