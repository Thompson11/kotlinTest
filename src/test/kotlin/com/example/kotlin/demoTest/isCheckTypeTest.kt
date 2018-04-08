package com.example.kotlin.demoTest

import com.example.kotlin.demo.getLength
import org.junit.Assert
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
 * @since V1.0 <br>
 */
@RunWith(JUnit4::class)
class IsCheckTypeTest {
    @Test
    fun testGetLength() {
        val obj = "abcdef"
        val len = getLength(obj)
        Assert.assertTrue(len == 6)

        val obj2 = Any()
        getLength(obj2)
    }
}
