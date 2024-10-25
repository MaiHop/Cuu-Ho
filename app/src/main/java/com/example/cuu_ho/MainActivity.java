package com.example.cuu_ho;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.cuu_ho.Persentation.Activity.Intro.LoadingActivity;
import com.example.cuu_ho.Persentation.Activity.Intro.WelcomeActivity;
import com.example.cuu_ho.Persentation.Fragment.AccountFragment;
import com.example.cuu_ho.Persentation.Fragment.HistoryFragment;
import com.example.cuu_ho.Persentation.Fragment.HomeFragment;
import com.example.cuu_ho.Persentation.Fragment.WorkShopFragment;
import com.example.cuu_ho.databinding.ActivityLoadingBinding;
import com.example.cuu_ho.databinding.ActivityLoginBinding;
import com.example.cuu_ho.databinding.ActivityMainBinding;
import com.example.cuu_ho.databinding.ActivityRegisterBinding;

public class MainActivity extends AppCompatActivity {
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
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}