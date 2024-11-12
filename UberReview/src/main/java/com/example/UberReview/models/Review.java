package com.example.UberReview.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.processing.Generated;
import java.util.Date;

@Getter
@Setter
// apply the builder pattern and create a builder object for it and we not to have a no args/all args constructor for it
@Builder
@NoArgsConstructor
@AllArgsConstructor
// to enable the lifecycle events of JPA entity
@EntityListeners(AuditingEntityListener.class)
@Entity
// create a table with this name if its not present already
@Table(name="bookingreview")
// If we already have the @entity then why we are using @table ??
// table is working on the db end only.
// entity is working on the java end.
public class Review extends BaseModel{
    // content property cannot be null
    // it may not update in the db after server restart. final way to manage the db would be migrations
    @Column(nullable=false)
    private String content;

    private Double rating;

    @Override
    public String toString(){
    return "Review "+ this.content+" "+this.rating;
}

}
