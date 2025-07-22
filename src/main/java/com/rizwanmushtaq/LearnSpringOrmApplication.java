package com.rizwanmushtaq;

import com.rizwanmushtaq.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {
  @Autowired
  private UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(LearnSpringOrmApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    User user = new User();
//    user.setName("Rizwan Mushtaq");
//    user.setEmail("rizwan@gmail.com");
//    user.setCity("Srinagar");
//    user.setAge(30);
//    User savedUser = userService.saveUser(user);
//    System.out.println(savedUser);
//    userService.getAllUsers().forEach(System.out::println);
//    System.out.println(userService.getUserById(1));
    System.out.println(userService.getUserById(20));
  }
}
