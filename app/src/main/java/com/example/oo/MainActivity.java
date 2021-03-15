package com.example.oo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {
    String pdfUrl = "http://www.data.jma.go.jp/fcd/yoho/data/jishin/kaisetsu_tanki_latest.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(pdfUrl));
            startActivity(intent);
            finish();
        }, 3000);
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent();
//                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse(pdfUrl));
//                startActivity(intent);
//                finish();
//            }
//        }, 3000);
//    }
}