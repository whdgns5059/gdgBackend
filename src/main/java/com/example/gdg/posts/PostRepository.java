package com.example.gdg.posts;

import com.example.gdg.commons.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Posts, Long> {

    Optional<Posts> findById(long id);

    @Override
    Posts save(Posts posts);
}
