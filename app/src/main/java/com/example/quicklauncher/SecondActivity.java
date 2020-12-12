package com.example.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.quicklauncher.HELLOALLUC")) {
            TextView tv = findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.quicklauncher.HELLOALLUC");

            tv.setText(text);
        }
    }
}