package au.com.millsoft.sample.api

import au.com.millsoft.sample.handler.Awesome
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GatewayInterface(val handler: Awesome) {

    @GetMapping("/test")
    fun  greatApi() : String{
        return "${handler.getMessage()} ${handler.getAnotherMessage()} \n"
    }
}
