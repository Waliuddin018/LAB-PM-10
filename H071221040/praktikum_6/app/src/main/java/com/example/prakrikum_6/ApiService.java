package com.example.prakrikum_6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/users")
    Call<UserResponse> getUsers(@Query("page") int page, @Query("per_page") int per_page);

    @GET("api/users/{id}")
    Call<User> getUserById(@Path("id") int userId);
}