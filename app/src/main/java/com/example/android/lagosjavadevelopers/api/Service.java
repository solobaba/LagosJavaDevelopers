package com.example.android.lagosjavadevelopers.api;

import com.example.android.lagosjavadevelopers.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SOLOBABA on 04/08/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
