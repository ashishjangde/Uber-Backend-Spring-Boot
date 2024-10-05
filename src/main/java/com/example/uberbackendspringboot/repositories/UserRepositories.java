package com.example.uberbackendspringboot.repositories;

import com.example.uberbackendspringboot.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<UserEntity , Long> {
}
