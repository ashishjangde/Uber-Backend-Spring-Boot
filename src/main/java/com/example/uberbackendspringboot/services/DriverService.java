package com.example.uberbackendspringboot.services;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.dto.RideDto;

import java.util.List;

public interface DriverService {
    RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto rateRide(Long rideId , Integer rating);
    DriverDto getMyProfile();
    List<DriverDto> getAllDrivers();

}
