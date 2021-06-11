package br.com.celfons.data.integration.api.client
import br.com.celfons.data.integration.api.client.request.CustomerRequest
import br.com.celfons.data.integration.api.client.response.CustomerResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PutMapping

@FeignClient(name = "CustomerApiRw", url = "url")
interface CustomerApiRw {

    @PutMapping("/customer")
    fun update(customerRequest: CustomerRequest): CustomerResponse

}
