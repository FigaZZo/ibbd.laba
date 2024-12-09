package com.ibbd.laba

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Student(
    val secondname: String?,
    val firstname: String?,
    val fathername: String?,
    var year: Int?,
    var groupId: String?,
    var faculty: String?,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val studentId: Int? = null,
)