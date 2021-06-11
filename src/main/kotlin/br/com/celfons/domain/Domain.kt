package br.com.celfons.domain

import java.time.LocalDateTime
import java.util.UUID

abstract class Domain {

    open var id: UUID? = UUID.randomUUID()

    var createAt: LocalDateTime? = LocalDateTime.now()

}
