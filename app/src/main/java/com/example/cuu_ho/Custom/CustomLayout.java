package com.example.cuu_ho.Custom;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.databinding.ActivityCustomButtonLayoutBinding;


public class CustomLayout extends AppCompatActivity {
    ActivityCustomButtonLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomButtonLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
    }
}