package com.rizwanmushtaq.services;

import com.rizwanmushtaq.entities.Student;

import java.util.List;

public interface StudentService {
  Student saveStudent(Student student);

  Student updateStudent(Student student, int studentId);

  Student deleteStudent(int studentId);

  List<Student> getAllStudents();

  Student getStudentById(int studentId);
}
