package com.example.cuu_ho.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.cuu_ho.Holder.NotificationHolder;
import com.example.cuu_ho.databinding.ItemNotificationBinding;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationHolder> {
    private List<String> data;

    public NotificationAdapter(List<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public NotificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemNotificationBinding binding = ItemNotificationBinding.inflate(inflater, parent, false);
        return new NotificationHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationHolder holder, int position) {
        String notificationData = data.get(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}