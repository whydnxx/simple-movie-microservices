package dev.whydn.ratingsdataservice.controllers;

import dev.whydn.ratingsdataservice.models.Rating;
import dev.whydn.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId) {
        return new Rating(movieId, 4);
    }

    @GetMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable String userId) {
        List<Rating> ratings = Arrays.asList(
            new Rating("1", 4),
            new Rating("2", 6)
        );

        return new UserRating(ratings);
    }
}
