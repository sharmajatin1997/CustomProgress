package com.app.progress;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.app.progressbar.CustomProgressDialog;

public class MainActivity extends AppCompatActivity {

    private TextView textView, textView1, textView2;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);

        textView.setOnClickListener(view -> {
            /** start progress*/
            CustomProgressDialog.showDefault(this);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {
                    /**  hide progress*/
                    CustomProgressDialog.hide();
                }
            }, 5000);
        });


        textView1.setOnClickListener(view -> {
            /** start progress*/
            CustomProgressDialog.showCustomLoading(this, R.drawable.doctor_style);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {
                    /**  hide progress*/
                    CustomProgressDialog.hide();
                }
            }, 5000);
        });

        textView2.setOnClickListener(view -> {
            /** start progress*/
            CustomProgressDialog.createCustomLoading(this, R.drawable.double_style, 250, 250);
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