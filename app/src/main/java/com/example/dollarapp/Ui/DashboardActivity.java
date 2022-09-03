package com.example.dollarapp.Ui;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import com.example.dollarapp.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://dolarhoje.com/");
    }
}