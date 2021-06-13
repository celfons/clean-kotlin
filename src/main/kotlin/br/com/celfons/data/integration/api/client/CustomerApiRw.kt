package br.com.celfons.data.integration.api.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PutMapping

@FeignClient(name = "CustomerApiRw", url = "url")
interface CustomerApiRw {

    @PutMapping("/customer")
    fun update()

}
