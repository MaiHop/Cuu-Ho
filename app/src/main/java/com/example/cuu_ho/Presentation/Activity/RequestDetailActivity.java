package com.example.cuu_ho.Presentation.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.cuu_ho.R;
import com.example.cuu_ho.databinding.ActivityMainBinding;
import com.example.cuu_ho.databinding.ActivityRegisterBinding;
import com.example.cuu_ho.databinding.ActivityRequestDetailBinding;

public class RequestDetailActivity extends AppCompatActivity {
    ActivityRequestDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityRequestDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.edtRequestDetailLicensePlate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // Ẩn hint khi EditText được focus
                    binding.tilRequestDetailLicensePlate.setHint("");
                } else {
                    if (binding.edtRequestDetailLicensePlate.getText().length() > 0) {
                        binding.tilRequestDetailLicensePlate.setHint("");
                    } else {
                        // Hiện lại hint khi mất focus
                        binding.tilRequestDetailLicensePlate.setHint("Nhập biển số xe");
                    }
                }
            }
        });

        binding.tietRequestDetailDescription.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // Ẩn hint khi EditText được focus
                    binding.tilRequestDetailDescription.setHint("");
                } else {
                    if(binding.tietRequestDetailDescription.getText().length()>0){
                        binding.tilRequestDetailDescription.setHint("");
                    }else{
                        // Hiện lại hint khi mất focus
                        binding.tilRequestDetailDescription.setHint("Nhập biển số xe");
                    }

                }
            }
        });
    }
}
