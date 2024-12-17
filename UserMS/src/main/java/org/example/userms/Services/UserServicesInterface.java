package org.example.userms.Services;

import org.example.userms.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserServicesInterface {
    public Optional<User> getUser(long id);
    public List<User> getAllUsers();
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);

}
