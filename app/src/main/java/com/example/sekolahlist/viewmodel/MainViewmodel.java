package com.example.sekolahlist.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sekolahlist.model.SchollEntity;
import com.example.sekolahlist.model.SchoolResponse;
import com.example.sekolahlist.repository.SchoolRepositoryImpl;

import java.util.List;

public class MainViewmodel extends AndroidViewModel {

    private SchoolRepositoryImpl schoolRepository;
    private LiveData<SchoolResponse> dataLive;

    public MainViewmodel(@NonNull Application application){
        super(application);

        schoolRepository = new SchoolRepositoryImpl();
        dataLive = schoolRepository.getSchool();
    }

    public LiveData<SchoolResponse> getScholl(){
        return dataLive;
    }

}
