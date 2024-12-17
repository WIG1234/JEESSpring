package org.example.userms.Services;

import org.example.userms.Entities.User;
import org.example.userms.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class UserServices implements UserServicesInterface {
    @Autowired
    UserRepository UR;

    @Override
    public Optional<User> getUser(long id) {
        return UR.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return UR.findAll();
    }

    @Override
    public User createUser(User user) {
        return UR.save(user);
    }

    @Override
    public User updateUser(User user) {
        return UR.save(user);
    }

    @Override
    public void deleteUser(long id) {
       UR.deleteById(id);
    }
}
