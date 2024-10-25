package com.example.cuu_ho.Persentation.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.cuu_ho.R;
import com.example.cuu_ho.databinding.ActivityRegisterBinding;
import com.example.cuu_ho.databinding.ActivityRequestDetailBinding;


public class RequestDetailActivity extends AppCompatActivity {
    ActivityRequestDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRequestDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}