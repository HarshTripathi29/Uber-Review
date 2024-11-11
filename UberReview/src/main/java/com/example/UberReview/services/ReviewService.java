package com.example.UberReview.services;

import com.example.UberReview.models.Review;
import com.example.UberReview.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception{

        System.out.println("************");
        // builder is creating an object of review with data.
        Review r = Review.builder()
                .content("uber ride service")
// if dont want to add the dates manually then use EntityListeners(AuditingEntityListener.class) in Review model
// also enableJpaAuditing in the main java class
//                .createdAt(new Date())
//                .updatedAt(new Date())
                .rating(4.0)
                .build();
        System.out.println(r);
        reviewRepository.save(r);

//        for(Review review : reviews)
//        {
//            System.out.println(r.getContent());
//        }
//        reviewRepository.deleteById(2L);
    }
}
