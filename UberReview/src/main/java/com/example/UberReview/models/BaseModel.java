package com.example.UberReview.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
//dont need to create the object of this class
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    // when the record was created
    @Column(nullable=false)
    // automate spring to make sure that it automatically takes the date in created at
    @Temporal(TemporalType.TIMESTAMP)  // format of date to be stored e.g Timestamp
    // only handle it for object creation
    @CreatedDate
    protected Date createdAt; // all the classes that are deriving should be able to use

    // when the record was updated lasttime
    @Column(nullable=false)
    // automate spring to make sure that it automatically takes the date in updated at
    @Temporal(TemporalType.TIMESTAMP)
    // only handle it for object update
    @LastModifiedDate
    protected Date updatedAt;
}
