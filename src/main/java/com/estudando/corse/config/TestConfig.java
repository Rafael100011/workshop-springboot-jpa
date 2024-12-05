package com.estudando.corse.config;


import com.estudando.corse.entities.User;
import com.estudando.corse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Rafael","rafael@outlook.com","1193482-0826","rafael@123");
        User u2= new User(null,"Marta","bradao@outlook.com","1193482-0000","brandao@123");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
