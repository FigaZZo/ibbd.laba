package com.ibbd.laba

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.data.domain.Example
import org.springframework.data.domain.ExampleMatcher
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service


private val logger = KotlinLogging.logger {}

@Service
class StudentService(private val db: StudentsRepository) {
    fun getStudentList(): List<Student> {
        logger.debug { "SELECT * FROM students"}
        return db.findAll().toList()
    }

    fun addStudent(student: Student): Unit {
        logger.debug{ "Adding student to database" }
        db.save(student)
    }

    fun updateStudent(student: Student): Unit {
        logger.debug{ "Update student with id ${student.studentId}" }
        db.save(student)
    }

    fun deleteStudent(id: Int): Unit {
        logger.debug{ "Deleting student with id $id" }
        db.deleteById(id)
    }

    fun getStudentBlock(page: Int, limit: Int, filter: Student): List<Student> {
        val matcher: ExampleMatcher = ExampleMatcher.matching()
        val example: Example<Student> = Example.of(filter, matcher)
        return db.findAll(example, PageRequest.of(page, limit)).toList()
    }
}