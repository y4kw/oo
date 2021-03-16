package com.example.oo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.app.WallpaperInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Browser;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {
    //String url = "http://www.data.jma.go.jp/fcd/yoho/data/jishin/kaisetsu_tanki_latest.pdf";
    String url = "https://www.jma.go.jp/bosai/map.html#4/28.536/123.486/&elem=vap&contents=himawari";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            builder.setToolbarColor(Color.parseColor("#0099cc"));
            builder.setShowTitle(true);
            //builder.enableUrlBarHiding();
            CustomTabsIntent tabsIntent = builder.build();
            tabsIntent.launchUrl(this, Uri.parse(url));

            //Intent intent = new Intent();
            //intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            //intent.putExtra(Browser.EXTRA_APPLICATION_ID, "com.android.chrome");
            ////intent.putExtra(Browser.EXTRA_APPLICATION_ID, context.getPackageName());
            //intent.setAction(Intent.ACTION_VIEW);
            //intent.setData(Uri.parse(url));
            //startActivity(intent);
            //finish();
        }, 300);
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