package com.example.uberbackendspringboot.entities;

import com.example.uberbackendspringboot.entities.enums.PaymentMethod;
import com.example.uberbackendspringboot.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Table(name = "ride")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RideEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rideId;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;


    @ManyToOne(fetch = FetchType.LAZY)
    private RiderEntity rider;


    @ManyToOne(fetch = FetchType.LAZY)
    private DriverEntity driver;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private String otp;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;


}
