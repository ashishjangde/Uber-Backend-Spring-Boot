package com.example.uberbackendspringboot.entities;

import com.example.uberbackendspringboot.entities.enums.PaymentMethod;
import com.example.uberbackendspringboot.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;


@Entity
@Table(name = "ride_request")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RideRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;


    @ManyToOne(fetch = FetchType.LAZY)
    private RiderEntity rider;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

    private Double fare;









}
