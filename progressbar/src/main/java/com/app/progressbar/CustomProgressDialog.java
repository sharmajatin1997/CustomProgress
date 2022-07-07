package com.app.progressbar;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class CustomProgressDialog {

    private static Dialog dialog;
    private static TextView text;

    public static void show(Context context) {
        if (dialog != null) {
            hide();
        }
        dialog = new Dialog(context, R.style.Progress_Dialog_Horizontal);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.setContentView(R.layout.progressbar);

        text = dialog.findViewById(R.id.text_wait);

//        Animation animFadeIn = AnimationUtils.loadAnimation(dialog.getContext(), R.anim.animation_fadein);
//        text.startAnimation(animFadeIn);

//        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Animation animFadeOut = AnimationUtils.loadAnimation(dialog.getContext(), R.anim.fade_out);
//                text.startAnimation(animFadeOut);
//                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        Animation animFadeIn = AnimationUtils.loadAnimation(dialog.getContext(), R.anim.animation_fadein);
//                        text.startAnimation(animFadeIn);
//                    }
//                }, 3000);
//            }
//        }, 3000);
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
