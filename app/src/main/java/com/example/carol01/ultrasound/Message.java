package com.example.carol01.ultrasound;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by chingya on 2015/10/27.
 */
public class Message extends AppCompatActivity {


    private WebView WebView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

        WebView1 = (WebView) findViewById(R.id.webView1);
        WebView1.setWebChromeClient(new WebChromeClient());
        WebView1.getSettings().setJavaScriptEnabled(true);

        WebView1.setWebViewClient(new WebViewClient() {});
        WebView1.loadUrl("http://tlk.io/ultrasound");

    }
}
