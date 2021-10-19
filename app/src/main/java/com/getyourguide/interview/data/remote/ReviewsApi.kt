package com.getyourguide.interview.data.remote

import retrofit2.http.GET

interface ReviewsApi {

  @GET("activities/23776/reviews")
  suspend fun getReviews(): ReviewResponse
}
