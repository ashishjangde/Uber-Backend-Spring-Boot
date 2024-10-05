package com.example.uberbackendspringboot.entities;

import com.example.uberbackendspringboot.entities.enums.Roles;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    //create another table for roles name user_roles
    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)  //roles as it store automatically save as number
    private Set<Roles> roles;






}
