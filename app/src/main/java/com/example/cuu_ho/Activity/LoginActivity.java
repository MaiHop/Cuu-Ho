package com.example.cuu_ho.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.Dialog.CustomDialog;
import com.example.cuu_ho.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEdtEmpty()) {
                    CustomDialog customDialog = new CustomDialog(LoginActivity.this);
                    customDialog.showDialogLoading();
                    Handler handler = new Handler();
                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
                            customDialog.cancel();
                            showDialogSuccess(customDialog);
                        }
                    };
                    handler.postDelayed(runnable, 5000);
                }
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

    private void showDialogSuccess(CustomDialog customDialog ) {
        customDialog.showDialogNotification("Đăng ký thành công",
                "Bạn đã là thành viên của Rescuezy",
                CustomDialog.SUCCESS);
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                customDialog.cancel();
            }
        };
        handler.postDelayed(runnable, 5000);
    }

    private boolean checkEdtEmpty() {
        if(binding.edtPhone.getText().toString().isEmpty()) {
            binding.edtPhoneLayout.setError("Email không được để trống!");
        }
        if(binding.edtPassword.getText().toString().isEmpty()) {
            binding.edtPasswordLayout.setError("Password không được để trống!");
        } else return true;
        return false;
    }
}