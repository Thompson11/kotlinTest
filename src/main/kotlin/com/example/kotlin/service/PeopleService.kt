package com.example.kotlin.service

import com.example.kotlin.entity.People
import com.example.kotlin.repository.PeopleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

/**
 * Description: <br>
 *
 * @author lu.geyu <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2018年04月04日 <br>
 * @see com.example.kotlin.service <br>
 * @since R8.0 <br>
 */
@Service
class PeopleService : PeopleRepository {
    @Autowired
    val peopleRepository: PeopleRepository? = null

    override fun <S : People?> save(entity: S): S {
        return peopleRepository?.save(entity)!!
    }

    override fun findAll(): MutableIterable<People> {
        return peopleRepository?.findAll()!!
    }

    override fun deleteById(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteAll(entities: MutableIterable<People>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteAll() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <S : People?> saveAll(entities: MutableIterable<S>): MutableIterable<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun count(): Long {
        return peopleRepository?.count()!!
    }

    override fun findAllById(ids: MutableIterable<Long>): MutableIterable<People> {
        return peopleRepository?.findAllById(ids)!!
    }

    override fun existsById(id: Long): Boolean {
        return peopleRepository?.existsById(id)!!
    }

    override fun findById(id: Long): Optional<People> {
        return peopleRepository?.findById(id)!!
    }

    override fun delete(entity: People) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findByLastName(lastName: String): List<People>? {
        return peopleRepository?.findByLastName(lastName)
    }
}