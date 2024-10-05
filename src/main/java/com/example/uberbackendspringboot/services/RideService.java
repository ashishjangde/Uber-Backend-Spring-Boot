package com.example.uberbackendspringboot.services;

import com.example.uberbackendspringboot.dto.RideDto;
import com.example.uberbackendspringboot.dto.RideRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


public interface RideService {
    RideDto getRideById(Long rideId);
    void matchWithDriver(RideRequestDto rideRequestDto);
    RideDto createNewRide(RideRequestDto rideRequestDto);
    RideDto updateRideStatus(Long rideId, RideRequestDto rideRequestDto);
    Page<RideDto> getAllRideOfRider(Long riderId, PageRequest pageRequest);
    Page<RideDto> getAllRideOfDriver(Long driverId, PageRequest pageRequest);
}
