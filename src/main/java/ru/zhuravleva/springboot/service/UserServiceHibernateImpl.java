package ru.zhuravleva.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.zhuravleva.springboot.dao.UserDao;
import ru.zhuravleva.springboot.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceHibernateImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceHibernateImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(long id, User updatedUser) {
        userDao.update(id, updatedUser);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}
