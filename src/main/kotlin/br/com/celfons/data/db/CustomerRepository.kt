package br.com.celfons.data.db

import br.com.celfons.data.db.dto.CustomerDTO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CustomerRepository: JpaRepository<CustomerDTO, UUID>
