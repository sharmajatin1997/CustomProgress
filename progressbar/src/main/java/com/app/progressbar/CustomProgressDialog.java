package com.app.progressbar;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.Window;

import pl.droidsonroids.gif.GifImageView;

public class CustomProgressDialog {

    private static Dialog dialog;
    private static GifImageView gif;

    public static void showDefault(Context context, float dim) {
        if (dialog != null) {
            hide();
        }
        dialog = new Dialog(context, R.style.Progress_Dialog_Horizontal);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
        Window window=dialog.getWindow();
        window.setDimAmount(dim);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.setContentView(R.layout.progressbar);
        gif = dialog.findViewById(R.id.gif);
        gif.setImageResource(R.drawable.loading_color);
        dialog.show();
    }

    public static void showCustomLoading(Context context, int drawableGif,float dim) {
        if (dialog != null) {
            hide();
        }
        dialog = new Dialog(context, R.style.Progress_Dialog_Horizontal);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
        Window window=dialog.getWindow();
       window.setDimAmount(dim);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.setContentView(R.layout.progressbar);
        gif = dialog.findViewById(R.id.gif);
        gif.setImageResource(drawableGif);
        dialog.show();
    }

    public static void createCustomLoading(Context context, int drawableGif, int height, int width,float dim) {
        if (dialog != null) {
            hide();
        }
        dialog = new Dialog(context, R.style.Progress_Dialog_Horizontal);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
        Window window=dialog.getWindow();
        window.setDimAmount(dim);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.setContentView(R.layout.progressbar);
        gif = dialog.findViewById(R.id.gif);
        gif.getLayoutParams().height = height;
        gif.getLayoutParams().width = width;

        gif.setImageResource(drawableGif);
        dialog.show();
    }

    public static void hide() {
        try {
            if (dialog != null) {
                dialog.hide();
                dialog.dismiss();
                dialog = null;
            }
        } catch (Exception e) {

        }
    }

}
