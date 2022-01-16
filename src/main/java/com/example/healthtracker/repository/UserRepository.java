package com.example.healthtracker.repository;

import com.example.healthtracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByLoginAndPassword(String login, String password);


}
