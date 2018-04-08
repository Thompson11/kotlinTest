package com.example.kotlin.demoTest

import com.example.kotlin.demo.Motorbike
import com.example.kotlin.demo.what
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月05日 <br>
 * @see com.example.kotlin.demoTest <br>
 * @since R8.0 <br>
 */
@RunWith(JUnit4::class)
class PackageDemoTest {
    @Test
    fun testWhat() {
        what()
    }

    @Test
    fun testDriverMotorbike() {
        val motorbike = Motorbike()
        motorbike.drive()
    }
}