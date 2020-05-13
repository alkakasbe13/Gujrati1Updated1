package com.example.gujrati.services;


import com.example.gujrati.models.Example;
import com.example.gujrati.models.Product;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("product.php")
    abstract public Call<Example> getProducts();

}