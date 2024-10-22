package com.example.uberbackendspringboot.strategies;

import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.entities.RideRequestEntity;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;
    double calculateFare(RideRequestEntity rideRequestEntity);
}
