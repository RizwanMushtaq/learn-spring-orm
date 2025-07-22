package com.rizwanmushtaq.services.impl;

import com.rizwanmushtaq.entities.User;
import com.rizwanmushtaq.repositories.UserRepository;
import com.rizwanmushtaq.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
  @Autowired
  private UserRepository userRepository;

  @Override
  public User saveUser(User user) {
    User savedUser = userRepository.save(user);
    logger.info("User saved successfully: {}", savedUser);
    return savedUser;
  }

  @Override
  public User updateUser(User user, int userId) {
    User user1 = userRepository.findById(userId).orElseThrow(
        () -> new RuntimeException("User not found with id: " + userId));
    user1.setName(user.getName());
    user1.setEmail(user.getEmail());
    user1.setCity(user.getCity());
    user1.setAge(user.getAge());
    User updatedUser = userRepository.save(user1);
    return updatedUser;
  }

  @Override
  public User deleteUser(int userId) {
    User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
    return user;
  }

  @Override
  public List<User> getAllUsers() {
    List<User> users = userRepository.findAll();
    return users;
  }

  @Override
  public User getUserById(int userId) {
    Optional<User> userOptional = userRepository.findById(userId);
    User user = userOptional.orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
    return user;
  }
}
