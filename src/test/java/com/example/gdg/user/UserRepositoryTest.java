package com.example.gdg.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findById() {
        Optional<Users> users = userRepository.findById(1L);
        assertEquals(1L, users.get().getId());
    }

    @Test
    void findByEmail() {

    }

    @Test
    void updatePassword() {
    }

    @Test
    void deleteById() {
    }
}