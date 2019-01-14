package com.example.adrien.tenorels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
        // Creation du webview
        WebView webView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_web_view);

            //Pour YouTube, on peut rajouter dans le AndroidManifest l'attribut android:acceleretedHardware=true
            //pour que YouTube soit lancé dans notre application plutôt qu'avec l'application YouTube
            webView = findViewById(R.id.webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.youtube.fr");
        }
}

