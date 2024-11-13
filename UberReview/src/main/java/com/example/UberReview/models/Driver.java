package com.example.UberReview.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {

    private String name;

    @Column(nullable=false, unique = true)
    private String licenseNumber;

    // A driver has many bookings so we wanna get all the bookings of a driver
    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();
}
