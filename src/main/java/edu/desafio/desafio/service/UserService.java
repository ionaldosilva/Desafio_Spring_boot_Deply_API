package edu.desafio.desafio.service;

import edu.desafio.desafio.model.User;

public interface UserService {
    
    User findById(Long id);

    User create(User userToCreate);
}
