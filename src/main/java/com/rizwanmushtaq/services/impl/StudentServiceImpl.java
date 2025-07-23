package com.rizwanmushtaq.services.impl;

import com.rizwanmushtaq.entities.Student;
import com.rizwanmushtaq.repositories.StudentRepository;
import com.rizwanmushtaq.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student saveStudent(Student student) {
    Student savedStudent = studentRepository.save(student);
    return savedStudent;
  }

  @Override
  public Student updateStudent(Student student, int studentId) {
    Student existingStudent = studentRepository.findById(studentId)
        .orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));
    existingStudent.setName(student.getName());
    existingStudent.setEmail(student.getEmail());
    return studentRepository.save(existingStudent);
  }

  @Override
  public Student deleteStudent(int studentId) {
    Student student = studentRepository.findById(studentId).
        orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));
    studentRepository.delete(student);
    return student;
  }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  @Override
  public Student getStudentById(int studentId) {
    return studentRepository.findById(studentId)
        .orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));
  }
}
