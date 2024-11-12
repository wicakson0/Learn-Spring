package com.wicakson0.crud.repository;

import com.wicakson0.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
