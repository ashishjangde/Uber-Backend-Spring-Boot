package com.example.uberbackendspringboot.repositories;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.entities.DriverEntity;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepositories extends JpaRepository<DriverEntity , Long> {

    @Query(value = "SELECT d.*, ST_Distance(d.current_location, :pickupLocation) AS distance " +
            "FROM driver d " +
            "WHERE d.is_available = true AND ST_DWithin(d.current_location, :pickupLocation, 10000) " +
            "ORDER BY distance " +
            "LIMIT 10", nativeQuery = true)
    List<DriverDto> findTenNearestDrivers(Point pickupLocation);
}
