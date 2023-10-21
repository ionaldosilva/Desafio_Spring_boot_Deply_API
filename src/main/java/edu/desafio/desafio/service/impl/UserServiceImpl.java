package edu.desafio.desafio.service.impl;


import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import edu.desafio.desafio.Repository.UserRepository;
import edu.desafio.desafio.model.User;
import edu.desafio.desafio.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);

    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("Este usuário já existe");
        }
        return userRepository.save(userToCreate);
    }
    
}
