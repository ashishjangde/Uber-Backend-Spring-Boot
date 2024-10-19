package com.example.uberbackendspringboot.entities;

import com.example.uberbackendspringboot.entities.enums.TransactionType;
import com.example.uberbackendspringboot.entities.enums.TransactonMethods;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "wallet_transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactonMethods transactonMethods;

    @OneToOne
    private RideEntity ride;

    private String transactionId;

    @ManyToOne
    private WalletEntity wallet;

    private LocalDateTime timestamp;
}
