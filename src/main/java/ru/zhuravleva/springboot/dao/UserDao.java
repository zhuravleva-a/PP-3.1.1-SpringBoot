package ru.zhuravleva.springboot.dao;

import ru.zhuravleva.springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void save(User user);
    void update(long id, User updatedUser);
    void delete(long id);
}
