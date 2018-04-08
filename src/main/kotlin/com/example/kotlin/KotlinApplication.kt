package com.example.kotlin

import com.example.kotlin.entity.People
import com.example.kotlin.service.PeopleService
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class KotlinApplication {
    private val log = LoggerFactory.getLogger(KotlinApplication::class.java)

    @Bean
    fun init(repository: PeopleService) = CommandLineRunner {
        val now = Date()
        repository.save(People(null, "Jason", "Chen", "Male", 28, now, now))
        repository.save(People(null, "Bluce", "Li", "Male", 32, now, now))
        repository.save(People(null, "Corey", "Chen", "Female", 20, now, now))

        for (people in repository.findAll()!!) {
            log.info(people.toString())
        }

        val customer = repository.findAll()
        log.info(customer.toString())
        for(chen in repository.findByLastName("Chen")!!) {
            log.info(chen.toString())
        }
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinApplication>(*args)
}
