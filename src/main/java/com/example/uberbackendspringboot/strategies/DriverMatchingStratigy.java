package com.example.uberbackendspringboot.strategies;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.dto.RideRequestDto;

import java.util.List;

public interface DriverMatchingStratigy {
    List<DriverDto> findMatchingDrivers(RideRequestDto rideRequestDto);
}
