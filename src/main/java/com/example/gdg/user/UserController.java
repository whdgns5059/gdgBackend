package com.example.gdg.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Users findById(@PathVariable(value="id") Long id){
        return userService.findById(id);
    }

    @GetMapping("/user/email/{email}")
    public List<Users> findByEmail(@PathVariable(value="email") String email)    {
        return userService.findByEmail(email);
    }

    @GetMapping("/user/updatePassword")
    public int updatePassword(Long id, String password){
        return userService.updatePassword(id, password);
    }

    @GetMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        userService.deleteById(id);
    }

}
