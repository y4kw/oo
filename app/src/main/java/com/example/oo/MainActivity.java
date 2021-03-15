package com.example.oo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {
    String pdfUrl = "http://www.data.jma.go.jp/fcd/yoho/data/jishin/kaisetsu_tanki_latest.pdf";

    //private Handler handler = new Handler();
    //private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
//            Intent intent = new Intent();
//            intent.setAction(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse(pdfUrl));
//            startActivity(intent);
//            finish();
//            overridePendingTransition(0, 0);
                //Intent intent = new Intent(WelcomeSplashLogo.this, LoginActivity.class);
                Intent intent = new Intent();
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(pdfUrl));
                startActivity(intent);
                finish();
            }
        //handler = new Handler();
        //handler.postDelayed(runnable, 19000);  // delay time...
        //new void Handler().postDelayed(runnable, 3333);
        }, 3000);
        //Handler handler;
        //handler = new Handler();
        //Handler handler = new Handler();
        //handler.postDelayed(runnable, 1900);  // delay time...
//        Handler hdl = new Handler();
//        // 500mséå»¶ããã¦splashHandlerãå®è¡ãã¾ãã
//        hdl.postDelayed(new splashHandler(), 500);
//    }
//    class splashHandler {
//        public void run() {
//            Intent intent = new Intent();
//            intent.setAction(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse(pdfUrl));
//            startActivity(intent);
//            finish();
//            overridePendingTransition(0, 0);
//        }

    }
}