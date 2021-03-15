package com.example.oo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperInfo;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Browser;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {
    //String url = "http://www.data.jma.go.jp/fcd/yoho/data/jishin/kaisetsu_tanki_latest.pdf";
    String url = "http://www.jma.go.jp/bosai/map.html#4/28.536/123.486/&elem=vap&contents=himawari";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            intent.putExtra(Browser.EXTRA_APPLICATION_ID, "com.android.chrome");
            //intent.putExtra(Browser.EXTRA_APPLICATION_ID, context.getPackageName());
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
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