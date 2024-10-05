package com.example.uberbackendspringboot.strategies.impl;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.strategies.DriverMatchingStratigy;

import java.util.List;

public class DriverMatchingNearestDriverStrategyImpl implements DriverMatchingStratigy {
    @Override
    public List<DriverDto> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
