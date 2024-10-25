package com.example.cuu_ho.Activity.ResetPassword;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.databinding.ActivityResetPasswordSuccessBinding;


public class ResetPasswordSuccessActivity extends AppCompatActivity {
    ActivityResetPasswordSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResetPasswordSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
    }
}
