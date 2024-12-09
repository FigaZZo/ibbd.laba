package com.ibbd.laba

import org.springframework.data.repository.CrudRepository

interface StudentsRepository: CrudRepository<Student, Int> {}