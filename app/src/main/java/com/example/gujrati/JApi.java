package com.example.gujrati;

import retrofit2.Call;
import retrofit2.http.GET;

public abstract class JApi {


    @GET("newpaithani.json")
    public abstract Call<NoticeList> getNoticeData();

}
