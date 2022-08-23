package io.gordonpm.bicycleratingsservice.controller;

import io.gordonpm.bicycleratingsservice.models.BicycleRating;
import io.gordonpm.bicycleratingsservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bicycleratings")
public class BicycleRatingController {

    @RequestMapping("/{bicycleId}")
    public BicycleRating getRating(@PathVariable("bicycleId") String bicycleId) {
        return new BicycleRating(bicycleId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<BicycleRating> ratings = Arrays.asList(
                new BicycleRating("100", 4),
                new BicycleRating("200", 3)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
