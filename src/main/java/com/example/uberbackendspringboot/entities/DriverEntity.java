package com.example.uberbackendspringboot.entities;

import jakarta.persistence.*;
import lombok.*;
import org.locationtech.jts.geom.Point;

@Entity
@Table(name = "Driver")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id")
    @OneToOne
    private UserEntity user;

    private Double Rating;

    private Boolean isAvailable;

    private String vehicleId;

    @Column(columnDefinition = "Geometry(Point,4326)")  //4326 for earth for dealing with geoSpatial location
    private Point currentLocation;


}
