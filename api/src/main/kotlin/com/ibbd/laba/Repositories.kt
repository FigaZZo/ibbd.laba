package com.ibbd.laba

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface StudentsRepository: JpaRepository<Student, Int> {
}