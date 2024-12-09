package com.ibbd.laba

import com.fasterxml.jackson.databind.util.JSONPObject
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.web.bind.annotation.*

private val logger = KotlinLogging.logger {}
private val mapper = jacksonObjectMapper()

@RestController
@RequestMapping("/")
class Controller(private val service: StudentService) {

    @GetMapping("/students")
    fun getStudentList(): String {
        logger.debug{ "Getting student list" }
        return mapper.writeValueAsString(service.getStudentList())
    }

    @PostMapping(value = ["/students/add"], consumes = ["application/json"])
    fun addStudent(@RequestBody student: Student) {
        logger.debug{ student.studentId }
        service.addStudent(student)
    }

    @PatchMapping(value = ["/students/update"], consumes = ["application/json"])
    fun updateStudent(@RequestBody student: Student) {
        logger.debug{ "Updating student with id ${student.studentId}" }
        service.updateStudent(student)
    }

    @DeleteMapping(value = ["/students/delete/{id}"])
    fun deleteStudent(@PathVariable(value = "id") id: Int) {
        logger.debug{ "Deleting student with id $id" }
        service.deleteStudent(id)
    }
}