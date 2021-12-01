package com.pab.api_makeup.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "http://makeup-api.herokuapp.com/api/v1/";

    @GET("products.json?product_type=lipstick")
    Call<List<Result>> getsuperHeroes();
}