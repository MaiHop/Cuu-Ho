package com.example.cuu_ho.Test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.databinding.ActivityCustomButtonLayoutBinding;
import com.example.cuu_ho.databinding.ActivityRequestDetailBinding;

public class Test extends AppCompatActivity {
    ActivityCustomButtonLayoutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomButtonLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
