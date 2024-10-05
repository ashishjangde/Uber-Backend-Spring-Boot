package com.example.uberbackendspringboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

@Entity
@Table(name = "Driver")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    @JoinColumn(name = "user_id")
    @OneToOne
    private UserEntity user;

    @Column(columnDefinition = "Geometry(Point,4326)")  //4326 for earth for dealing with geoSpatial location
    private Point currentLocation;


    private Double Rating;

    private Boolean isAvailable;




}
