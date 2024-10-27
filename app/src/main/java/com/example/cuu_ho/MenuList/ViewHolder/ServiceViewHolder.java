package com.example.cuu_ho.MenuList.ViewHolder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuu_ho.R;

public class ServiceViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_name_service, tv_price_service;

    public ServiceViewHolder(@NonNull View itemView) {
        super(itemView);
        init();
    }

    private void init(){
        tv_name_service = itemView.findViewById(R.id.tv_name_service);
        tv_price_service = itemView.findViewById(R.id.tv_price_service);
    }
}
