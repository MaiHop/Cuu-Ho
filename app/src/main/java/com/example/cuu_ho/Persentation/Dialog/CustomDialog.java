package com.example.cuu_ho.Persentation.Dialog;


import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.Window;

import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cuu_ho.R;


public class CustomDialog {
    public static final int ERROR = 1;
    public static final int SUCCESS = 2;
    public static final int WARNING = 3;
    public static final int LOADING = 4;
    private final Activity activity;
    private String title;
    private int type;
    private Dialog dialog;

    public CustomDialog(Activity activity) {
        this.activity = activity;
        this.title = title;
    }

    public void showDialogLoading() {
        dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_loading);

        TextView textView = dialog.findViewById(R.id.textLoading);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setLayout(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            Drawable background = ContextCompat.getDrawable(activity, R.drawable.layout_dialog);
            dialog.getWindow().setBackgroundDrawable(background);
        }
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            private int dotCount = 0;
            @Override
            public void run() {
                String text = textView.getText().toString();
                if (dotCount < 3) {
                    textView.setText(text + ".");
                    dotCount++;
                } else {
                    textView.setText(text.substring(0, text.length() - 3));
                    dotCount = 0;
                }
                handler.postDelayed(this, 500);
            }
        };
        handler.post(runnable);
        dialog.show();
    }

    public void showDialogNotification(String title, String text, int type) {
        dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_notification);

        TextView textView = dialog.findViewById(R.id.text);
        ImageView iconView = dialog.findViewById(R.id.icon);
        TextView titleView = dialog.findViewById(R.id.title);

        if (dialog.getWindow() != null) {
            dialog.getWindow().setLayout(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            Drawable background = ContextCompat.getDrawable(activity, R.drawable.layout_dialog);
            dialog.getWindow().setBackgroundDrawable(background);
        }
        switch (type) {
            case 1: {
                textView.setText(text);
                Drawable background = ContextCompat.getDrawable(activity, R.drawable.ic_success);
                iconView.setBackground(background);
                titleView.setText(title);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
        }
        dialog.show();
    }

    public void cancel() {
        dialog.dismiss();
    }
}
