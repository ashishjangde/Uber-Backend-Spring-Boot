package com.example.uberbackendspringboot.strategies.impl;

import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;


@Service
public class RideFareDefaultFareCalculationStratigyImp implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
