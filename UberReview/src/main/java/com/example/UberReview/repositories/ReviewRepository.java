package com.example.UberReview.repositories;

import com.example.UberReview.models.Review;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

// communicate to the db .
@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
