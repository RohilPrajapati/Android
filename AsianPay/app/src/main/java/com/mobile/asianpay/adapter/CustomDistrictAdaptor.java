package com.mobile.asianpay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mobile.asianpay.R;
import model.DistrictModel;

import java.util.ArrayList;

public class CustomDistrictAdaptor extends RecyclerView.Adapter<CustomDistrictAdaptor.ViewHolder> {

    private Context context;
    private ArrayList<DistrictModel> dataArray;

    public CustomDistrictAdaptor(Context context, ArrayList<DistrictModel> dataArray){
        this.context = context;
        this.dataArray = dataArray;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.district_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DistrictModel item = dataArray.get(position);
        holder.districtName.setText(item.getDistrictname());
        holder.population.setText(""+item.getPopulation());
        holder.avgTemperature.setText(""+item.getAvgTemperature());
        holder.area.setText(""+item.getArea());
    }

    @Override
    public int getItemCount() {
        return dataArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView districtName,population,avgTemperature, area;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            districtName = itemView.findViewById(R.id.district_name);
            population = itemView.findViewById(R.id.population);
            avgTemperature = itemView.findViewById(R.id.temp);
            area = itemView.findViewById(R.id.area);
        }
    }
}

