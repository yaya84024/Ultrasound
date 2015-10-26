package com.example.carol01.ultrasound;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by chingya on 2015/10/27.
 */
public class MessageList extends AppCompatActivity {

    private WebView WebView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_list);

        WebView1 = (WebView) findViewById(R.id.webView);
        WebView1.setWebViewClient(mWebViewClient);
        WebView1.loadUrl("http://tw.yahoo.com");

    }


    WebViewClient mWebViewClient = new WebViewClient() {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    };

}
