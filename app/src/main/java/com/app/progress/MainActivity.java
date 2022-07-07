package com.app.progress;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.app.progressbar.CustomProgressDialog;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);

        textView.setOnClickListener(view -> {
         /** start progress*/
            CustomProgressDialog.show(this);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {
              /**  hide progress*/
                    CustomProgressDialog.hide();
                }
            }, 5000);
        });


    }


}