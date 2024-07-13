package com.example.sekolahlist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sekolahlist.R;
import com.example.sekolahlist.model.SchollEntity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.ViewHolder> {

    private Context context;
    ArrayList<SchollEntity> schoolList;

    public SchoolAdapter(Context context, ArrayList<SchollEntity> schoolList) {
        this.context = context;
        this.schoolList =schoolList;
    }


    @NonNull
    @Override
    public SchoolAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolAdapter.ViewHolder holder, int position) {
        SchollEntity school = schoolList.get(position);
        holder.tvName.setText(school.getSekolah());
        holder.tvKecamatan.setText(school.getKecamatan());
    }

    @Override
    public int getItemCount() {
        return schoolList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvName;
        private final TextView tvKecamatan;
        public ViewHolder(@NonNull View view) {
            super(view);
            tvName =(TextView) view.findViewById(R.id.tvName);
            tvKecamatan = (TextView) view.findViewById(R.id.tvKecamatan);
        }
    }
}
