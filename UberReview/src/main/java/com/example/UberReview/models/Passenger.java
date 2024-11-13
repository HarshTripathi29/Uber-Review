package com.example.UberReview.models;

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
public class Passenger extends BaseModel{
    private String name;

    // mapped by is necessary in one to many relation other wise spring will create join tables
    // the property name in the many class should be same as the mapped by property which we are putting here
    @OneToMany(mappedBy="abcd")
    private List<Booking> bookings = new ArrayList<>();

}