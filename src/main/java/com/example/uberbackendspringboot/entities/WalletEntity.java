package com.example.uberbackendspringboot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "wallet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private UserEntity user;

    private Double balance;

    @OneToMany(fetch = FetchType.LAZY ,mappedBy = "wallet")
    private List<WalletTransaction> walletTransactionsList;

}
