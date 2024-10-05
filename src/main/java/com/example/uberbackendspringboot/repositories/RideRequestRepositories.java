package com.example.uberbackendspringboot.repositories;

import com.example.uberbackendspringboot.entities.RideRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepositories extends JpaRepository<RideRequestEntity ,Long> {
}
