package io.gordonpm.bicycleratingsservice.models;

public class BicycleRating {

    private String bicycleId;
    private int rating;

    public BicycleRating(String bicycleId, int rating) {
        this.bicycleId = bicycleId;
        this.rating = rating;
    }

    public String getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(String bicycleId) {
        this.bicycleId = bicycleId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
