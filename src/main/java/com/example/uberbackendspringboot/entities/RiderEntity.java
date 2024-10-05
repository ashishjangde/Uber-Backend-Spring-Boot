package com.example.uberbackendspringboot.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rider")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RiderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long riderId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private Double rating;

}
