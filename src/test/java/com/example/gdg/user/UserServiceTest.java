package com.example.gdg.user;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    private UserService userService;

    @BeforeEach
    void init(){

        userService = new UserService(userRepository);

    }

    @Test
    void findById() {

        //given
        Long id = 1L;
        Optional<Users> opUsers = Optional.of(new Users.Builder(1L)
                .email("asdf")
                .password("qwer")
                .build());
        Mockito.when(userRepository.findById(1L)).thenReturn(opUsers);
        //BDDMockito 와의 차이점은?
        //https://velog.io/@lxxjn0/Mockito%EC%99%80-BDDMockito%EB%8A%94-%EB%AD%90%EA%B0%80-%EB%8B%A4%EB%A5%BC%EA%B9%8C

        //when
        Users resultUser = userService.findById(1L);
        //then
        assertEquals("asdf", resultUser.getEmail());

    }
}