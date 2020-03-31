package com.example.ohmyinsecurewebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;
import java.util.Map;

public class WebviewLoadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_load);
        WebView webView=findViewById(R.id.webview);

        Bundle  extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String URL = extras.getString("URL");
        String auth= extras.getString("Authorization");
        if (URL != null && auth!=null) {
            webView.loadUrl(URL);
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", auth);
            WebViewClient wc= new myWebClient();
            webView.setWebViewClient(wc);
            webView.loadUrl(URL, headers);
        }


    }
}
