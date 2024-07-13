package com.example.sekolahlist.network;

import com.example.sekolahlist.model.SchollEntity;
import com.example.sekolahlist.model.SchoolResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/sekolah?page=1&perPage=5")
    Call<SchoolResponse> getSchool();

}
