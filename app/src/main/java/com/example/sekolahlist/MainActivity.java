package com.example.sekolahlist;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sekolahlist.adapter.SchoolAdapter;
import com.example.sekolahlist.model.SchollEntity;
import com.example.sekolahlist.viewmodel.MainViewmodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private MainViewmodel mainViewmodel;
    private RecyclerView rvSchool;
    private SchoolAdapter schoolAdapter;
    private LinearLayoutManager linearLayoutManager;

    private ArrayList<SchollEntity> schoolList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        mainViewmodel = new ViewModelProvider(this).get(MainViewmodel.class);
        rvSchool = (RecyclerView) findViewById(R.id.rvSchool);
        linearLayoutManager = new LinearLayoutManager(this);
        rvSchool.setLayoutManager(linearLayoutManager);

        mainViewmodel.getScholl().observe(this, it -> {
           List<SchollEntity> school = it.getDataSekolah();

           schoolList.addAll(school);

            schoolAdapter = new SchoolAdapter(this,schoolList);
            rvSchool.setAdapter(schoolAdapter);
            schoolAdapter.notifyDataSetChanged();
        });
    }
}