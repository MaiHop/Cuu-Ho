package com.example.cuu_ho.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.Dialog.CustomDialog;
import com.example.cuu_ho.databinding.ActivityRegisterBinding;


public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEdtEmpty()) {
                    CustomDialog customDialog = new CustomDialog(RegisterActivity.this);
                    customDialog.showDialogLoading();
                    Handler handler = new Handler();
                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
                            customDialog.cancel();
                        }
                    };
                    handler.postDelayed(runnable, 5000);
                }
            }
        });
        binding.edtName.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                binding.edtNameLayout.setError(null);
            }
        });
        binding.edtPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                binding.edtPasswordLayout.setError(null);
            }
        });
        binding.edtPhone.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                binding.edtPhoneLayout.setError(null);
            }
        });
        binding.btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private boolean checkEdtEmpty() {
        if(binding.edtName.getText().toString().isEmpty()) {
            binding.edtPasswordLayout.setError("Tên không được để trống!");
        }else if(binding.edtPhone.getText().toString().isEmpty()) {
            binding.edtPhoneLayout.setError("Số điện thoại không được để trống!");
        }else if(binding.edtPassword.getText().toString().isEmpty()) {
            binding.edtPasswordLayout.setError("Password không được để trống!");
        } else return true;
        return false;
    }
}