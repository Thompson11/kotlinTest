package com.example.kotlin.repository

import com.example.kotlin.entity.People
import org.springframework.data.repository.CrudRepository

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月04日 <br>
 * @see com.example.kotlin.repository <br>
 * @since R8.0 <br>
 */
interface PeopleRepository : CrudRepository<People, Long> {
    fun findByLastName(lastName: String): List<People>?
}