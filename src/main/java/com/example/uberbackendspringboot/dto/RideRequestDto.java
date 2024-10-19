package com.example.uberbackendspringboot.dto;

import com.example.uberbackendspringboot.entities.enums.PaymentMethod;
import com.example.uberbackendspringboot.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;

    private PointDto pickupLocation;

    private PointDto dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private RideRequestStatus rideRequestStatus;

    private PaymentMethod paymentMethod;


}
