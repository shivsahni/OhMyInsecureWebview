package com.example.ohmyinsecurewebview;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class myWebClient extends WebViewClient
{

    public boolean shouldOverrideUrlLoading(WebView view, String url){
        //view.loadUrl(url);
        return false; // then it is not handled by default action
    }

}
