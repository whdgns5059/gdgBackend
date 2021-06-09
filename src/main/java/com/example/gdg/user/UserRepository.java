package com.example.gdg.user;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

    @Override
    Optional<Users> findById(Long aLong);

    List<Users> findByEmail(String email);

    @Modifying
    @Query("update users set password = :password where id = :id")
    int updatePassword(@Param("id") Long id, @Param("password") String password);

    @Override
    void deleteById(Long aLong);

    @Override
    Users save(Users user);
}
