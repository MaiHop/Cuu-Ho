package com.example.cuu_ho.Presentation.Dialog;


import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.cuu_ho.R;


public class CustomDialog {
    public static final int SUCCESS = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;
    public static final int DISCONNECT = 4;
    public static final int NOTIFICATION = 5;
    public static final int AVATAR_WRENCH = 6;

    public static final int LEFT_RIGHT = 1;
    public static final int TOP_BOTTOM = 2;
    public static final int CENTER = 3;

    private Activity activity;
    private String title = "";
    private String text = "";
    private String textBtn = "Có";
    private String textBtnOutline = "Không";
    private int type = 0;
    private int typeLayoutBtn = 0;
    private int btnDrawableOutline = 0;
    private int textDrawableOutline = 0;
    private int titleDrawable = 0;
    private boolean isLoading = false;
    private boolean isListView = false;
    private boolean isBack = false;
    private Dialog dialog;
    private RecyclerView listView;
    private AppCompatTextView btnView;
    private AppCompatTextView btnViewOutline;
    private AppCompatTextView btnViewOutlineLeft;
    private AppCompatTextView btnViewRight;

    public CustomDialog(Activity activity) {
        this.activity = activity;
    }

    public CustomDialog setText(String name) {
        this.text = name;
        return this;
    }

    public CustomDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public CustomDialog setType(int type) {
        this.type = type;
        return this;
    }

    public CustomDialog setTitleDrawable(int titleDrawable) {
        this.titleDrawable = titleDrawable;
        return this;
    }

    public CustomDialog setBtnDrawableOutline(int btnDrawableOutline) {
        this.btnDrawableOutline = btnDrawableOutline;
        return this;
    }

    public CustomDialog setLoading(boolean loading) {
        isLoading = loading;
        return this;
    }

    public CustomDialog setBack(boolean back) {
        this.isBack = back;
        return this;
    }

    public CustomDialog setTypeLayoutBtn(int typeLayoutBtn) {
        this.typeLayoutBtn = typeLayoutBtn;
        return this;
    }

    public CustomDialog setTextDrawableOutline(int textDrawableOutline) {
        this.textDrawableOutline = textDrawableOutline;
        return this;
    }

    public CustomDialog setListView(boolean listView) {
        isListView = listView;
        return this;
    }

    public CustomDialog setTextBtn(String textBtn) {
        this.textBtn = textBtn;
        return this;
    }

    public CustomDialog setTextBtnOutline(String textBtnOutline) {
        this.textBtnOutline = textBtnOutline;
        return this;
    }

    public AppCompatTextView getBtnRight() {
        return btnViewRight;
    }

    public AppCompatTextView getBtnOutlineLeft() {
        return btnViewOutlineLeft;
    }

    public AppCompatTextView getBtnOutline() {
        return btnViewOutline;
    }

    public AppCompatTextView getBtn() {
        return btnView;
    }

    public RecyclerView getListView() {
        return listView;
    }

    public CustomDialog showDialogLoading() {
        dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_loading);
        dialog.setCancelable(false);

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
        return this;
    }

    public CustomDialog show() {
        dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_notification);

        TextView textView = dialog.findViewById(R.id.text);
        ImageView iconView = dialog.findViewById(R.id.icon);
        TextView titleView = dialog.findViewById(R.id.title);
        AppCompatImageButton btnBack = dialog.findViewById(R.id.btn_back);
        listView = dialog.findViewById(R.id.list_view);
        ProgressBar loading = dialog.findViewById(R.id.loading);
        btnView = dialog.findViewById(R.id.btn_view);
        btnViewOutline = dialog.findViewById(R.id.btn_view_outline);
        View layoutBtnView = dialog.findViewById(R.id.layout_btn_view);
        btnViewOutlineLeft = dialog.findViewById(R.id.btn_view_outline_left);
        btnViewRight = dialog.findViewById(R.id.btn_view_right);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        if (dialog.getWindow() != null) {
            dialog.getWindow().setLayout(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            Drawable background = ContextCompat.getDrawable(activity, R.drawable.layout_dialog);
            dialog.getWindow().setBackgroundDrawable(background);
        }

        if(isBack) {
            btnBack.setVisibility(View.VISIBLE);
        }
        if(isLoading) {
            loading.setVisibility(View.VISIBLE);
        }
        if(!text.isEmpty()) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(text);
        }
        if(isListView) {
            listView.setVisibility(View.VISIBLE);
        }
        if(!title.isEmpty()) {
            titleView.setVisibility(View.VISIBLE);
            titleView.setText(title);
        }
        switch (type) {
            case 1: {
                Drawable background = ContextCompat.getDrawable(activity, R.drawable.ic_success);
                iconView.setBackground(background);
                break;
            }
            case 2: {
                Drawable background = ContextCompat.getDrawable(activity, R.drawable.ic_warning);
                iconView.setBackground(background);
                break;
            }
            case 4: {
                Drawable background = ContextCompat.getDrawable(activity, R.drawable.ic_disconnect_wifi);
                iconView.setBackground(background);
                break;
            }
            case 5: {
                Drawable background = ContextCompat.getDrawable(activity, R.drawable.ic_notification);
                iconView.setBackground(background);
                break;
            }
            case 6: {
                Drawable background = ContextCompat.getDrawable(activity, R.drawable.ic_avatar_wrench);
                iconView.setBackground(background);
                break;
            }
            default: {
                iconView.setVisibility(View.GONE);
                break;
            }
        }
        switch (typeLayoutBtn) {
            case 1: {
                layoutBtnView.setVisibility(View.VISIBLE);
                btnViewOutlineLeft.setText(textBtnOutline);
                btnViewRight.setText(textBtn);
                if(btnDrawableOutline != 0) {
                    Drawable background = ContextCompat.getDrawable(activity, btnDrawableOutline);
                    int textColor = ContextCompat.getColor(activity, textDrawableOutline);
                    btnViewOutlineLeft.setTextColor(textColor);
                    btnViewOutlineLeft.setBackground(background);
                }
                break;
            }
            case 2: {
                btnView.setVisibility(View.VISIBLE);
                btnViewOutline.setVisibility(View.VISIBLE);
                btnView.setText(textBtn);
                btnViewOutline.setText(textBtnOutline);
                break;
            }
            case 3: {
                if(titleDrawable != 0) {
                    int textColor = ContextCompat.getColor(activity, titleDrawable);
                    titleView.setTextColor(textColor);
                }
                if(btnDrawableOutline != 0) {
                    Drawable btnBackground = ContextCompat.getDrawable(activity, btnDrawableOutline);
                    int textColor = ContextCompat.getColor(activity, textDrawableOutline);
                    btnViewOutline.setTextColor(textColor);
                    btnViewOutline.setBackground(btnBackground);
                }
                btnViewOutline.setVisibility(View.VISIBLE);
                btnViewOutline.setText(textBtnOutline);
                break;
            }
        }
        dialog.show();
        return this;
    }

    public void cancel() {
        dialog.dismiss();
    }
}
