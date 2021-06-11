package br.com.celfons.data.db.dto

import br.com.celfons.middleware.entity.Customer
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class CustomerDTO(
    @Id
    override var id: UUID? = UUID.randomUUID(),
    @Column(name = "name")
    override val name: String? = null
) : Customer()
