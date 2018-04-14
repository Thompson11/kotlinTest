package com.example.kotlin.ooTest

import com.example.kotlin.oo.Person1
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
class Person1Test {
    @Test
    fun testPerson1() {
        val person1 = Person1()
        person1.name = "Jack"
        person1.age = 29
        person1.sex = "M"
        println("person1 = $person1")
    }
}