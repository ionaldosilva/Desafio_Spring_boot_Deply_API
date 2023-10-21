package edu.desafio.desafio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.desafio.desafio.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
