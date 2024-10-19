package com.example.uberbackendspringboot.controllers;


import com.example.uberbackendspringboot.dto.RideRequestDto;
import com.example.uberbackendspringboot.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;

    @PostMapping("/request-ride")
    public ResponseEntity<RideRequestDto> requestRide(@RequestBody RideRequestDto rideRequestDto) {
        RideRequestDto rideRequest = riderService.requestRide(rideRequestDto);
        if (rideRequest == null)  return ResponseEntity.notFound().build();
        return ResponseEntity.ok(rideRequest);
    }


}
