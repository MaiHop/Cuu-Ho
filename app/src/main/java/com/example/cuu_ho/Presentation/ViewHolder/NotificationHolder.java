package com.example.cuu_ho.Presentation.ViewHolder;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cuu_ho.databinding.ItemNotificationBinding;


public class NotificationHolder extends RecyclerView.ViewHolder {
    ItemNotificationBinding binding;
    public NotificationHolder(ItemNotificationBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

}

