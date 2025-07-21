package com.codewithchirag.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    private Long id;
    @Column(nullable = false,name = "bio")
    private String bio;
    @Column(nullable = false,name = "phone_number")
    private String phoneNumber;
    @Column(nullable = false,name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(nullable = false,name = "loyalty_points")
    private Integer loyaltyPoints;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    @ToString.Exclude
    private User user;

}
