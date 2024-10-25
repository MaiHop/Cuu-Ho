package com.example.cuu_ho.Presentation.Activity.ResetPassword;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuu_ho.Presentation.Dialog.CustomDialog;
import com.example.cuu_ho.databinding.ActivityResetPasswordNewBinding;


public class ResetPasswordNewActivity extends AppCompatActivity {
    ActivityResetPasswordNewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResetPasswordNewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }

    private void initialize() {
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkEdtEmpty()) {
                    CustomDialog customDialog = new CustomDialog(ResetPasswordNewActivity.this);
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
        binding.edtPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                binding.edtPasswordLayout.setError(null);
            }
        });
    }

    private boolean checkEdtEmpty() {
        String textPassword = binding.edtPassword.getText().toString();
        String textCheckedPassword = binding.edtCheckedPassword.getText().toString();
        if(textPassword.isEmpty()) {
            binding.edtPasswordLayout.setError("Mật khẩu không được để trống!");
        }
        if(textCheckedPassword.isEmpty()) {
            binding.edtCheckedPasswordLayout.setError("Mật khẩu không được để trống!");
        }
        if(textPassword.equals(textCheckedPassword)) {
            binding.edtCheckedPasswordLayout.setError("Mật khẩu không giống nhau ");
        } else return true;
        return false;
    }
}