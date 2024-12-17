package org.example.userms.Controller;


import org.example.userms.Entities.User;
import org.example.userms.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServices US;
    @RequestMapping("/all")
    public List<User> AllUsers(){
        return US.getAllUsers();
    }
    @RequestMapping("/{id}")
    public Optional<User> getUser(@PathVariable long id){
        return US.getUser(id);
    }
    @RequestMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id){
        US.deleteUser(id);
    }
    @PostMapping("/Create")
    public User CreateUser(@RequestBody User user){
        return US.createUser(user);
    }
    @PostMapping("/Update/{id}")
    public User UpdateUser(@PathVariable long id, @RequestBody User user){
        return US.updateUser(user);
    }
}
