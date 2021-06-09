package com.example.gdg.posts;

import com.example.gdg.user.UserRepository;
import com.example.gdg.user.Users;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class PostServiceTest {

    @Autowired
    private PostService postService;

    @Test
    void findById() {
        Posts posts = postService.findById(1L);
        assertEquals("제목1", posts.getTitle());
    }

    @Test
    void findUsersByPostsId() {

        Users users = postService.findUsersByPostsId(1L);
        assertEquals("asdf@asdf.or.kr", users.getEmail());

    }
}