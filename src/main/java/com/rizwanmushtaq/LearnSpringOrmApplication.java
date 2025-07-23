package com.rizwanmushtaq;

import com.rizwanmushtaq.entities.Laptop;
import com.rizwanmushtaq.entities.Student;
import com.rizwanmushtaq.services.LaptopService;
import com.rizwanmushtaq.services.StudentService;
import com.rizwanmushtaq.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {
  @Autowired
  private LaptopService laptopService;
  @Autowired
  private StudentService studentService;
  @Autowired
  private UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(LearnSpringOrmApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Application started...");
    Student student = new Student();
    student.setName("Rizwan");
    student.setEmail("test@h.com");
    Laptop laptop = new Laptop();
    laptop.setBrand("Dell");
    laptop.setModel("Inspiron 15");
    laptop.setStudent(student);
    student.setLaptop(laptop);
    studentService.saveStudent(student);
    System.out.println(studentService.getAllStudents());
    System.out.println(laptopService.getAllLaptops());
  }
}
