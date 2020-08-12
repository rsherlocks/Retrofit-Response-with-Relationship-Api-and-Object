package com.example.androidshaper.retrofitgetresponsewithrelationship;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OurRetrofitClient {

    @GET("teams/{id}")
    Call<ObjectQuery> getData(@Path("id") int id, @Query("api_token") String token);

    @GET("players")
    Call<ArrayDesignClass> getData(@Query("api_token") String token,@Query("country_id") int cid);
}
