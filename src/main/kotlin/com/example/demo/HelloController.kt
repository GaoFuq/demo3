package com.example.demo

import org.apache.commons.logging.LogFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    val log = LogFactory.getLog(HelloController::class.java)!!

    @GetMapping("/hello")
    fun sayHello(@RequestParam(value = "myName", defaultValue = "World") name: String?): Resp {
        log.info("sayHello $name")
        return Resp(200,"请求成功",name)
    }
}