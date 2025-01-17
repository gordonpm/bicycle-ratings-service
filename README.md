# Project Overview

Bicycle-ratings is a simple microservice built with Spring Boot and Maven which
implements a REST api which serves all the bicycle ratings for a given user. 


## API details

Sample URL to call the api:  

localhost:8083/bicycleratings/users/{userId}  
where userId can be any string

Sample response:
```
{
    "userRating": [
        {
            "bicycleId": "100",
            "rating": 4
        },
        {
            "bicycleId": "200",
            "rating": 3
        }
    ]
}  
```

