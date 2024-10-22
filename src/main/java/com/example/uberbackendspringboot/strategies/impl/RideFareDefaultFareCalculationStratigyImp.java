package com.example.uberbackendspringboot.strategies.impl;

import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.entities.RideRequestEntity;
import com.example.uberbackendspringboot.services.DistanceService;
import com.example.uberbackendspringboot.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculationStratigyImp implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequestEntity rideRequestEntity) {
        double distance = distanceService.calculateDistance(rideRequestEntity.getPickupLocation() , rideRequestEntity.getDropOffLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}
