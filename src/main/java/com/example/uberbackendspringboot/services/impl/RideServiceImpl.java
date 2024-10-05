package com.example.uberbackendspringboot.services.impl;

import com.example.uberbackendspringboot.dto.RideDto;
import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class RideServiceImpl implements RideService {
    @Override
    public RideDto getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDriver(RideRequestDto rideRequestDto) {

    }

    @Override
    public RideDto createNewRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto updateRideStatus(Long rideId, RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public Page<RideDto> getAllRideOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<RideDto> getAllRideOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
