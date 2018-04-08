package com.example.kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月04日 <br>
 * @see com.example.kotlin <br>
 * @since R8.0 <br>
 */
@RestController
class HelloWorldController {
    @GetMapping(value = *arrayOf("/helloworld", "/"))
    fun helloworld(): Any {
        return "Hello,World!"
    }
}