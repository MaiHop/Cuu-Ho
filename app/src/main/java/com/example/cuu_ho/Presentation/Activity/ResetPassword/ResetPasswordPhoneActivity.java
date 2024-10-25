package com.example.cuu_ho.Presentation.Activity.ResetPassword;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.Presentation.Dialog.CustomDialog;
import com.example.cuu_ho.databinding.ActivityResetPasswordPhoneBinding;


public class ResetPasswordPhoneActivity extends AppCompatActivity {
    ActivityResetPasswordPhoneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResetPasswordPhoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEdtEmpty()) {
//                    CustomDialog customDialog = new CustomDialog(ResetPasswordPhoneActivity.this);
//                    customDialog.showDialogLoading();
//                    Handler handler = new Handler();
//                    Runnable runnable = new Runnable() {
//                        @Override
//                        public void run() {
//                            customDialog.cancel();
//                            Intent intent = new Intent(ResetPasswordPhoneActivity.this, ResetPasswordOTPActivity.class);
//                            startActivity(intent);
//                        }
//                    };
//                    handler.postDelayed(runnable, 5000);
                }
            }
        });
        binding.edtPhone.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                binding.edtPhoneLayout.setError(null);
            }
        });
    }

    private boolean checkEdtEmpty() {
        if(binding.edtPhone.getText().toString().isEmpty()) {
            binding.edtPhoneLayout.setError("Số điện thoại không được để trống!");
            return false;
        }
        return true;
    }
}