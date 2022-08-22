package io.gordonpm.bicycleratingsservice.controller;

import io.gordonpm.bicycleratingsservice.models.BicycleRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bicycleratings")
public class BicycleRatingController {

    @RequestMapping("/{bicycleId}")
    public BicycleRating getRating(@PathVariable("bicycleId") String bicycleId) {
        return new BicycleRating(bicycleId, 4);
    }


}
