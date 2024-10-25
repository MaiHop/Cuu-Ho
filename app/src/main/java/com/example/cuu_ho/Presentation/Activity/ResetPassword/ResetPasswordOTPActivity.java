package com.example.cuu_ho.Presentation.Activity.ResetPassword;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.Presentation.Dialog.CustomDialog;
import com.example.cuu_ho.databinding.ActivityResetPasswordOtpBinding;


public class ResetPasswordOTPActivity extends AppCompatActivity {
    ActivityResetPasswordOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResetPasswordOtpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
        binding.otp1.addTextChangedListener(new TextWatcher() {
            private boolean isUpdating = false;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (isUpdating) return;
                if (s.length() > 1) {
                    isUpdating = true;
                    binding.otp1.setText(String.valueOf(s.charAt(1)));
                    binding.otp1.setSelection(1);
                    binding.otp2.requestFocus();
                    isUpdating = false;
                } else if (s.length() == 1) {
                    binding.otp2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.otp2.addTextChangedListener(new TextWatcher() {
            private boolean isUpdating = false;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (isUpdating) return;
                if (s.length() > 1) {
                    isUpdating = true;
                    binding.otp2.setText(String.valueOf(s.charAt(1)));
                    binding.otp2.setSelection(1);
                    binding.otp3.requestFocus();
                    isUpdating = false;
                } else if (s.length() == 1) {
                    binding.otp3.requestFocus();
                } else {
                    binding.otp3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.otp3.addTextChangedListener(new TextWatcher() {
            private boolean isUpdating = false;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (isUpdating) return;
                if (s.length() > 1) {
                    isUpdating = true;
                    binding.otp3.setText(String.valueOf(s.charAt(1)));
                    binding.otp3.setSelection(1);
                    binding.otp4.requestFocus();
                    isUpdating = false;
                } else if (s.length() == 1) {
                    binding.otp4.requestFocus();
                } else {
                    binding.otp2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.otp4.addTextChangedListener(new TextWatcher() {
            private boolean isUpdating = false;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (isUpdating) return;
                if (s.length() > 1) {
                    isUpdating = true;
                    binding.otp4.setText(String.valueOf(s.charAt(1)));
                    binding.otp4.setSelection(1);
                    isUpdating = false;
                } else if (s.length() != 1) {
                    binding.otp3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog customDialog = new CustomDialog(ResetPasswordOTPActivity.this);
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
        });
    }
}