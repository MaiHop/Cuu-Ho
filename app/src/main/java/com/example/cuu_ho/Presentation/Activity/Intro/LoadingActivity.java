package com.example.cuu_ho.Presentation.Activity.Intro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.databinding.ActivityLoadingBinding;


public class LoadingActivity extends AppCompatActivity {
    ActivityLoadingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoadingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LoadingActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}
