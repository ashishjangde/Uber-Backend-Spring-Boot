package com.example.uberbackendspringboot.strategies;

import com.example.uberbackendspringboot.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
