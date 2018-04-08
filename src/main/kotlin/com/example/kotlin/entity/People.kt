package com.example.kotlin.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月04日 <br>
 * @see com.example.kotlin.entity <br>
 * @since R8.0 <br>
 */
@Entity
class People(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = 0L,
        val firstName: String? = "",
        val lastName: String? = "",
        val gender: String? = "",
        val age: Int? = 0,
        val gmtCreated: Date? = null,
        val gmtModified: Date? = null
) {
    override fun toString(): String {
        return "People(id=$id, firstName='$firstName', lastName='$lastName', " +
                "gender='$gender', age=$age, gmtCreated=$gmtCreated, gmtModified=$gmtModified)"
    }

}
