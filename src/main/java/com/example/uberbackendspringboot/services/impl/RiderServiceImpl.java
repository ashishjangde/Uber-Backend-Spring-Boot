package com.example.uberbackendspringboot.services.impl;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.dto.RideDto;
import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.dto.RiderDto;
import com.example.uberbackendspringboot.entities.RideRequestEntity;
import com.example.uberbackendspringboot.entities.enums.RideRequestStatus;
import com.example.uberbackendspringboot.repositories.RideRequestRepositories;
import com.example.uberbackendspringboot.services.RiderService;
import com.example.uberbackendspringboot.strategies.DriverMatchingStratigy;
import com.example.uberbackendspringboot.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final RideRequestRepositories rideRequestRepositories;
    private final DriverMatchingStratigy driverMatchingStratigy;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequestEntity rideRequestEntity = modelMapper.map(rideRequestDto, RideRequestEntity.class);
         rideRequestEntity.setRideRequestStatus(RideRequestStatus.PENDING);
         double fare =  rideFareCalculationStrategy(rideRequestDto);
         rideRequestEntity.setFare(fare);
         RideRequestEntity savedRideRequest = rideRequestRepositories.save(rideRequestEntity);
        driverMatchingStratigy.findMatchingDrivers(savedRideRequest);
         return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
