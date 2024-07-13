package com.example.sekolahlist.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.sekolahlist.model.SchollEntity;
import com.example.sekolahlist.model.SchoolResponse;
import com.example.sekolahlist.network.ApiInterface;
import com.example.sekolahlist.network.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SchoolRepositoryImpl {

    private ApiInterface apiInterface;

    public SchoolRepositoryImpl(){
        apiInterface = RetrofitClient.getInstance().create(ApiInterface.class);
    }

    public LiveData<SchoolResponse> getSchool(){
        final MutableLiveData<SchoolResponse> data = new MutableLiveData<>();

        apiInterface.getSchool().enqueue(new Callback<SchoolResponse>() {
            @Override
            public void onResponse(Call<SchoolResponse> call, Response<SchoolResponse> response) {
                if (response.isSuccessful()){
                       data.setValue(response.body());
                }



            }

            @Override
            public void onFailure(Call<SchoolResponse> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }

}
