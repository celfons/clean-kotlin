package br.com.celfons.data.controller.response

import java.time.LocalDateTime
import java.util.UUID

data class CustomerResponse (val id: UUID?, val name: String?, val createAt: LocalDateTime?)
