package com.example.oo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.app.WallpaperInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Browser;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String url;
    String urlTanki = "http://www.data.jma.go.jp/fcd/yoho/data/jishin/kaisetsu_tanki_latest.pdf";
    //String urlAXFE578 = "http://www.hbc.jp/tecweather/AXFE578.pdf";
    String urlAXFE578_12 = "https://www.jma.go.jp/bosai/numericmap/data/nwpmap/axfe578_12.pdf";
    String urlAXFE578_00 = "https://www.jma.go.jp/bosai/numericmap/data/nwpmap/axfe578_00.pdf";
    //String urlTanki = "http://www.data.jma.go.jp/fcd/yoho/data/jishin/kaisetsu_tanki_latest.pdf;http://www.hbc.jp/tecweather/AXFE578.pdf";
    String urlMe = "https://ifconfig.me";
    //String urlHimawari = "https://www.jma.go.jp/bosai/map.html#contents=himawari";
    //String urlHimawari = "https://www.jma.go.jp/bosai/map.html#elem=vap&contents=himawari";
    String urlHimawari = "https://www.jma.go.jp/bosai/map.html#4/40.000/110.000&elem=vap&contents=himawari";

    private WebView webview;

    @TargetApi(Build.VERSION_CODES.O)
    public void log(String... message) {
        String str = String.join("\t", message);
        String msg = ""
                + String.format("%1$3d",
                Thread.currentThread().getStackTrace()[3].getLineNumber()) + " "
                + Thread.currentThread().getStackTrace()[3].getMethodName() + " " + str;
        android.util.Log.d("MYDEBUG", msg);
        //Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true)
                        .enableUrlBarHiding()
                        .setToolbarColor(Color.parseColor("#0099cc"));
                CustomTabsIntent tabsIntent = builder.build();
                tabsIntent.intent.setPackage("com.google.android.apps.docs");
                tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_12));
                //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_00));
                //tabsIntent.launchUrl(this, Uri.parse(urlTanki));
            }, 0);

            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true)
                        .enableUrlBarHiding()
                        .setToolbarColor(Color.parseColor("#0099cc"));
                CustomTabsIntent tabsIntent = builder.build();
                tabsIntent.intent.setPackage("com.google.android.apps.docs");
                //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_12));
                tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_00));
                //tabsIntent.launchUrl(this, Uri.parse(urlTanki));
            }, 200);

            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true)
                        .enableUrlBarHiding()
                        .setToolbarColor(Color.parseColor("#0099cc"));
                CustomTabsIntent tabsIntent = builder.build();
                tabsIntent.intent.setPackage("com.google.android.apps.docs");
                tabsIntent.launchUrl(this, Uri.parse(urlTanki));
            },500);

            //new Handler(Looper.getMainLooper()).postDelayed(() -> {
            //    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            //    builder.setShowTitle(true)
            //            .enableUrlBarHiding()
            //            .setToolbarColor(Color.parseColor("#0099cc"));
            //    CustomTabsIntent tabsIntent = builder.build();
            //    tabsIntent.intent.setPackage("com.google.android.apps.docs");
            //    tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_12));
            //    tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_00));
            //    tabsIntent.launchUrl(this, Uri.parse(urlTanki));
            //}, 500);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true)
                        .enableUrlBarHiding()
                        .setToolbarColor(Color.parseColor("#0099cc"));
                CustomTabsIntent tabsIntent = builder.build();
                tabsIntent.intent.setPackage("com.google.android.apps.docs");
                //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_12));
                //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_00));
                tabsIntent.launchUrl(this, Uri.parse(urlTanki));
            }, 500);
        }

        //new Handler(Looper.getMainLooper()).postDelayed(() -> {
        //    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        //    builder.setShowTitle(true)
        //            .enableUrlBarHiding()
        //            .setToolbarColor(Color.parseColor("#0099cc"));
        //    CustomTabsIntent tabsIntent = builder.build();
        //    //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_12));
        //    //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_00));
        //    tabsIntent.launchUrl(this, Uri.parse(urlTanki));

        //}, 1500);


        //new Handler(Looper.getMainLooper()).post(() -> {
        //    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        //    builder.setShowTitle(true)
        //            .enableUrlBarHiding()
        //            .setToolbarColor(Color.parseColor("#0099cc"));
        //    CustomTabsIntent tabsIntent = builder.build();
        //    //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_12));
        //    //tabsIntent.launchUrl(this, Uri.parse(urlAXFE578_00));
        //    tabsIntent.launchUrl(this, Uri.parse(urlTanki));
        //});

        //new Handler(Looper.getMainLooper()).post(() -> {
        //    Intent intent = new Intent();
        //    intent.setAction(intent.ACTION_VIEW);
        //    intent.setData(Uri.parse(urlAXFE578_00));
        //    startActivity(intent);
        //});

        //new Handler(Looper.getMainLooper()).post(() -> {
        //    Intent intent = new Intent();
        //    intent.setAction(intent.ACTION_VIEW);
        //    intent.setData(Uri.parse(urlAXFE578_00));
        //    startActivity(intent);
        //    intent.setData(Uri.parse(urlTanki));
        //    startActivity(intent);
        //});

        //new Handler(Looper.getMainLooper()).postDelayed(() -> {
        //    Intent intent = new Intent();
        //    intent.setAction(intent.ACTION_VIEW);
        //    intent.setDataAndType(Uri.parse(urlAXFE578_00), "application/pdf");
        //    startActivity(intent);
        //}, 200);


        //new Handler(Looper.getMainLooper()).postDelayed(() -> {
        //    Intent intent = new Intent();
        //    intent.setAction(intent.ACTION_VIEW);
        //    intent.setDataAndType(Uri.parse(urlTanki), "application/pdf");
        //    startActivity(intent);
        //}, 5200);



        //new Handler(Looper.getMainLooper()).post(() -> {
        //    Intent intent = new Intent();
        //    intent.setAction(intent.ACTION_VIEW);
        //    intent.setData(Uri.parse(urlAXFE578_00));
        //    startActivity(intent);
        //});

        getSupportActionBar().hide();
        //getSupportActionBar().setDisplayShowTitleEnabled(true);
        //getSupportActionBar().setTitle(url);
        log();
        setContentView(R.layout.activity_main);

        webview = (WebView) findViewById(R.id.webView1);

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        //    CookieManager.getInstance().removeAllCookies(null);
        //    CookieManager.getInstance().flush();
        //} else {
        //    CookieSyncManager cookieSyncMngr =
        //            CookieSyncManager.createInstance(getApplicationContext());
        //    cookieSyncMngr.startSync();
        //    CookieManager cookieManager = CookieManager.getInstance();
        //    cookieManager.removeAllCookie();
        //    cookieManager.removeSessionCookie();
        //    cookieManager.setAcceptCookie(true);
        //    cookieSyncMngr.stopSync();
        //    cookieSyncMngr.sync();
        //}


        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webview.getSettings().setSupportZoom(true);
        //webview.getSettings().setUseWideViewPort(false);
        //webview.getSettings().setLoadWithOverviewMode(false);
        //webview.setInitialScale(300);
        //webview.getSettings().setBuiltInZoomControls(true);
        //webview.getSettings().setDisplayZoomControls(false);
        //webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        //webview.getSettings().setPluginState(WebSettings.PluginState.ON);

        //webview.setVerticalScrollBarEnabled(true);
        //webview.setHorizontalScrollBarEnabled(true);
        //webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //webview.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        //webview.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36 Edg/89.0.774.54");
        log();
        if (savedInstanceState == null) {
            log("savedInstanceState==null");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                url = urlHimawari;
            } else {
                url = urlMe;
            }
            webview.loadUrl(url);
        } else {
            log("NOTsavedInstanceState==null");
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab1.setOnClickListener(this);

        webview.setWebViewClient(new WebViewClient() {

//            boolean checkOnPageStartedCalled = false;

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                log();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                log();
            }


            @Override
            public void onReceivedError(WebView view, int errorCode, String description,
                                        String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                log();
            }

        });

    }

    public void onClick(View v) {
        log();
        if (v.getId() == R.id.fab) {
            //finish();
            Intent returmBtn = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(returmBtn);
        }
        if (v.getId() == R.id.fab1) {
            url = urlHimawari;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                webview.loadUrl(url);
            } else {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setShowTitle(true)
                        .enableUrlBarHiding()
                        .setToolbarColor(Color.parseColor("#0099cc"));
                CustomTabsIntent tabsIntent = builder.build();
                tabsIntent.launchUrl(this, Uri.parse(url));
            }
        }
    }

    public void onRestart() {
        log();
        super.onRestart();
    }

    @Override
    public void onResume() {
        log();
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        log();
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        log();
        super.onRestoreInstanceState(savedInstanceState);
    }
}