package com.rizwanmushtaq.repositories;

import com.rizwanmushtaq.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
