package com.example.uberbackendspringboot.strategies.impl;

import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.entities.RideRequestEntity;
import com.example.uberbackendspringboot.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;


@Service
public class RideFareSurgePricingFareCalculationStratigyImpl  implements RideFareCalculationStrategy {

    @Override
    public double calculateFare(RideRequestEntity rideRequestEntity) {
        return 0;
    }
}
