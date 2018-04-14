package com.example.kotlin.ooTest

import com.example.kotlin.oo.Person
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
class PersonTest {
    @Test
    fun testPerson() {
        val person = Person("jack", 29, "M")
        println("person = $person")
    }
}