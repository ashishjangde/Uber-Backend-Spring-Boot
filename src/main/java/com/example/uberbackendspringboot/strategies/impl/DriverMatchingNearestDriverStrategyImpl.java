package com.example.uberbackendspringboot.strategies.impl;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.entities.RideRequestEntity;
import com.example.uberbackendspringboot.repositories.DriverRepositories;
import com.example.uberbackendspringboot.strategies.DriverMatchingStratigy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategyImpl implements DriverMatchingStratigy {

    private final DriverRepositories driverRepositories;

    @Override
    public List<DriverDto> findMatchingDrivers(RideRequestEntity rideRequestEntity) {
        return driverRepositories.findTenNearestDrivers(rideRequestEntity.getPickupLocation());
    }
}
