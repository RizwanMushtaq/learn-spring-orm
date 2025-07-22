package com.rizwanmushtaq.services;

import com.rizwanmushtaq.entities.User;

import java.util.List;

public interface UserService {
  User saveUser(User user);

  User updateUser(User user, int userId);

  User deleteUser(int userId);

  List<User> getAllUsers();

  User getUserById(int userId);
}
