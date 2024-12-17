package org.example.userms;

import org.example.userms.Entities.User;
import org.example.userms.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserMsApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }
    @Autowired
    private UserRepository UR;
    @Override
    public void run(String... args) throws Exception {
            UR.save(new User(1L,"Sohaib","laalegzqhid@gmail.com\n","HDHHD","H(&##",""));




    }


}
