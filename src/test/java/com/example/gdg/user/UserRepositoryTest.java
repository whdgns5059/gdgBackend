package com.example.gdg.user;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Mock
    private UserRepository userRepository;

    @Test
    void findById() {

        Optional<Users> user = userRepository.findById(1L);
        assertEquals(1L, user.get().getId());
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

    @Test
    void testFindById() {
    }

    @Test
    void testFindByEmail() {
    }

    @Test
    void testUpdatePassword() {
    }

    @Test
    void testDeleteById() {
    }

    @Test
    void save() {
    }
}