package com.example.gdg.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

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

    @GetMapping("/user/join")
    public boolean join(String email, String password){
        return userService.join(email, password);
    }

}
