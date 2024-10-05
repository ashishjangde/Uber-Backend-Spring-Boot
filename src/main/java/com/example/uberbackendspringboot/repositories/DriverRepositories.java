package com.example.uberbackendspringboot.repositories;

import com.example.uberbackendspringboot.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepositories extends JpaRepository<DriverEntity , Long> {
}
