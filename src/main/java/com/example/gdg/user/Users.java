package com.example.gdg.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Getter
@Setter
public class Users {

    @Id
    private long id;
    private String email;
    private String password;

}
