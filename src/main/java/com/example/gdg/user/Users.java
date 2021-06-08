package com.example.gdg.user;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Users {

    public Users() {}
    private Users(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Id
    private long id;
    private String email;
    private String password;

    public static Users of(String email, String password){
        return new Users(email, password);
    }

}
