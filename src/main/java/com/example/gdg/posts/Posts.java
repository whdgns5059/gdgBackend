package com.example.gdg.posts;

import com.example.gdg.user.Users;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Posts {

    public Posts(){}

    public Posts(String title, String content, long writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    @Id
    private long id;
    private String title;
    private String content;
    private long writer;

    public static Posts of(String title, String content, long writer){
        return new Posts(title, content, writer);
    }

}
