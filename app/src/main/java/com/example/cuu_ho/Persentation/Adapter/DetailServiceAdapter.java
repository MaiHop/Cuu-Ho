package com.example.cuu_ho.Persentation.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuu_ho.MenuList.ViewHolder.ServiceViewHolder;
import com.example.cuu_ho.Persentation.ViewHolder.DetailerServiceViewHolder;
import com.example.cuu_ho.R;

public class DetailServiceAdapter extends RecyclerView.Adapter<DetailerServiceViewHolder>{
    @NonNull
    @Override
    public DetailerServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_complent_detail_service, parent, false);
        return new DetailerServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailerServiceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
