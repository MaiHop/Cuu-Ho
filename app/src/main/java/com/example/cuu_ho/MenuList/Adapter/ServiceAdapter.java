package com.example.cuu_ho.MenuList.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuu_ho.Domain.Response.ServiceResponse;
import com.example.cuu_ho.MenuList.ViewHolder.ServiceViewHolder;
import com.example.cuu_ho.R;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceViewHolder> {
    private List<ServiceResponse> serviceResponseList;

    public ServiceAdapter(List<ServiceResponse> serviceResponseList){
        this.serviceResponseList = serviceResponseList;
    }
    @NonNull
    @Override
    public ServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_service_list, parent, false);
        return new ServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceViewHolder holder, int position) {
        holder.tv_name_service.setText(serviceResponseList.get(position).getName_service());
        holder.tv_price_service.setText(String.valueOf(serviceResponseList.get(position).getPrice_service()));
    }

    @Override
    public int getItemCount() {
        return serviceResponseList.size();
    }
}
