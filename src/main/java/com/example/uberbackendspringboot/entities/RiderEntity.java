package com.example.uberbackendspringboot.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rider")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RiderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private Double rating;

}
