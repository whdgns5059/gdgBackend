package com.example.gdg.posts;

import com.example.gdg.user.UserRepository;
import com.example.gdg.user.Users;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = null;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Posts findById(Long id){
        return postRepository.findById(id).get();
    }

    public Users findUsersByPostsId(Long id){
        Posts posts = findById(id);
        return userRepository.findById(posts.getWriter()).get();
    }
}
