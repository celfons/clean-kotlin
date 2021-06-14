package br.com.celfons.domain

import java.time.LocalDateTime
import java.util.UUID

interface Domain {

    val id: UUID?

    var error: String?

    val createAt: LocalDateTime?

}
