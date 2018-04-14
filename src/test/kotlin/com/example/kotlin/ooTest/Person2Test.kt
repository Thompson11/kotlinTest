package com.example.kotlin.ooTest

import com.example.kotlin.oo.Person2
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月13日 <br>
 * @see com.example.kotlin.ooTest <br>
 * @since R8.0 <br>
 */
@RunWith(JUnit4::class)
class Person2Test {
    @Test
    fun person2Test() {
        val person21 = Person2()
        person21.name = "Jack"
        person21.age = 29
        person21.sex = "M"
        println("person21 = $person21")

        val person22 = Person2("Jack")
        person22.sex = "M"
        println("person22 = $person22")
    }
}