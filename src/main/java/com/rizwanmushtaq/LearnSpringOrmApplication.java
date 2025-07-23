package com.rizwanmushtaq;

import com.rizwanmushtaq.entities.Category;
import com.rizwanmushtaq.entities.Product;
import com.rizwanmushtaq.services.*;
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
  @Autowired
  private CategoryService categoryService;

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
    Category category1 = new Category();
    category1.setName("Electronics1");
    Category category2 = new Category();
    category2.setName("Gadgets1");
    Product product1 = new Product();
    product1.setName("Laptop1");
    Product product2 = new Product();
    product2.setName("Smartphone1");
    Product product3 = new Product();
    product3.setName("Tablet1");
    // Adding products to categories
    category1.getProducts().add(product1);
    category1.getProducts().add(product2);
    category2.getProducts().add(product1);
    category2.getProducts().add(product2);
    category2.getProducts().add(product3);
    // Adding categories to products
    product1.getCategories().add(category1);
    product1.getCategories().add(category2);
    product2.getCategories().add(category1);
    product2.getCategories().add(category2);
    product3.getCategories().add(category2);
    categoryService.saveCategory(category1);
    categoryService.saveCategory(category2);
  }
}
