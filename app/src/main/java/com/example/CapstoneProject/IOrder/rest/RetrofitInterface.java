package com.example.CapstoneProject.IOrder.rest;

import com.example.CapstoneProject.IOrder.model.Food;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("raw/iKfY2uk7")
    abstract public Call<Food> getFoods();
}