package com.rizwanmushtaq;

import com.rizwanmushtaq.services.AddressService;
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
  @Autowired
  private AddressService addressService;

  public static void main(String[] args) {
    SpringApplication.run(LearnSpringOrmApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Application started...");
//    Student student = new Student();
//    student.setName("John");
//    student.setEmail("test@john.com");
//    Address address = new Address();
//    address.setStreet("123 Main St");
//    address.setCity("New York");
//    address.setState("NY");
//    address.setZipCode("10001");
//    Address address2 = new Address();
//    address2.setStreet("456 Elm St");
//    address2.setCity("Los Angeles");
//    address2.setState("CA");
//    address2.setZipCode("90001");
//    student.getAddressList().add(address);
//    student.getAddressList().add(address2);
//    address.setStudent(student);
//    address2.setStudent(student);
//    studentService.saveStudent(student);
//    System.out.println(studentService.getAllStudents());
//    System.out.println(addressService.getAllAddresses());
  }
}
