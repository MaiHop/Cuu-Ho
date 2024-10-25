package com.example.cuu_ho.Presentation.Activity.ResetPassword;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.databinding.ActivityResetPasswordErrorBinding;


public class ResetPasswordErrorActivity extends AppCompatActivity {
    ActivityResetPasswordErrorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResetPasswordErrorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {

    }
}