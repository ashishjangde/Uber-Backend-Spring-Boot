package com.example.uberbackendspringboot.strategies;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.entities.RideRequestEntity;

import java.util.List;

public interface DriverMatchingStratigy {
    List<DriverDto> findMatchingDrivers(RideRequestEntity rideRequestEntity);
}
