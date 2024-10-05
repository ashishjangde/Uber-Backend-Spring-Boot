package com.example.uberbackendspringboot.repositories;

import com.example.uberbackendspringboot.entities.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepositories extends JpaRepository<RiderEntity,Long> {
}
