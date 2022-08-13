package org.asentors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.asentors.repository.UserRepository;
import org.asentors.model.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userDao;
    @Override
    public void create(User usr) {
        userDao.save(usr);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public void update(User usr) {
        userDao.save(usr);
    }

    @Override
    public void delete(User usr) {
        userDao.delete(usr);
    }
}