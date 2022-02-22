package com.example.demo
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest


/**
 * Created by http://quanke.name on 2018/1/10.
 */
@ControllerAdvice
@RestController
class GlobalExceptionHandler {

    @ExceptionHandler(value = [Exception::class])
    @Throws(Exception::class)
    fun defaultErrorHandler(req: HttpServletRequest, e: Exception): Resp {
        return Resp(10000,"${req.requestURL} 出错了",e.message)
    }
}