package br.com.celfons.data.controller

import br.com.celfons.data.controller.request.CustomerRequest
import br.com.celfons.data.controller.response.CustomerResponse
import br.com.celfons.data.db.dto.CustomerDTO
import br.com.celfons.middleware.entity.Customer
import br.com.celfons.middleware.input.CustomerFindAllInApi
import br.com.celfons.middleware.input.CustomerSaveInApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping(value = ["/customer"])
class CustomerController(
    @Autowired private var findAll: CustomerFindAllInApi,
    @Autowired private var save: CustomerSaveInApi
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody customer: CustomerRequest): CustomerResponse = save.execute(customer.toRequest()).toResponse()

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<CustomerResponse> = findAll.execute().toResponse()

    private fun Customer.toResponse(): CustomerResponse = CustomerResponse(this.id, this.name, this.createAt)

    private fun List<Customer>.toResponse(): List<CustomerResponse> = this.map { it.toResponse() }

    private fun CustomerRequest.toRequest(): Customer = CustomerDTO(name = this.name)

}
