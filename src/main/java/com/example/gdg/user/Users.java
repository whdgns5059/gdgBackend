package com.example.gdg.user;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Users {

    @Id
    private long id;
    private String email;
    private String password;

}
