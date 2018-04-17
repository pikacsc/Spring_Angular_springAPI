package com.csc.userportal;

import java.util.List;

public interface UserService {
    User create(User user);
    User delete(String id);
    List<User> findAll();
    User findById(String id);
    User update(User user);
}
