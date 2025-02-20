package me.dio.avanade.decola_tech.service;

import me.dio.avanade.decola_tech.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}