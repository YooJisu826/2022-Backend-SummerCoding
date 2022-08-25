package com.landvive.summer.mvc.repository;

import com.landvive.summer.mvc.entity.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByName(String name);

    void clearDb();
}
