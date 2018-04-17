package com.csc.userportal;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository {
    void delete(User user);
    List<User> findAll();
    User findOne(String id);
    User save(User user);
}
