package com.example.cuu_ho.Presentation.Activity.Intro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.databinding.ActivityWelcomeBinding;


public class WelcomeActivity extends AppCompatActivity {
    ActivityWelcomeBinding binding;
    Handler handler = new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, Intro1Activity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
