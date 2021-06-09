package com.example.gdg.user;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Getter
@Setter
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

    public static class Builder{
        private final long id;
        private String email;
        private String password;

        public Builder(Long id){
            this.id = id;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Users build(){
            return new Users(this);
        }
    }

    public Users(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.password = builder.password;
    }
}
