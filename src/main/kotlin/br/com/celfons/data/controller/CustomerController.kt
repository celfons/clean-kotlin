package br.com.celfons.data.controller

import br.com.celfons.data.controller.response.CustomerResponse
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerInApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(
    @Autowired private var portIn: CustomerInApi
) {

    @GetMapping
    fun getAll(): List<CustomerResponse> = portIn.execute().toResponse()

    private fun Customer.toResponse(): CustomerResponse = CustomerResponse(this.id, this.name, this.createAt)

    private fun List<Customer>.toResponse(): List<CustomerResponse> = this.map { it.toResponse() }

}
