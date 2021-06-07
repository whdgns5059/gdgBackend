package com.example.gdg.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users findById(Long id){
        return userRepository.findById(id).get();
    }

    public List<Users> findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public int updatePassword(Long id, String password){
        return userRepository.updatePassword(id, password);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }


}
