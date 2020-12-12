package com.example.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attempting to launch an activity inside our app
        Button secondActivityBtn = findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(v -> {
            Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);

            startIntent.putExtra("com.example.quicklauncher.HELLOALLUC", "HELLO, WORLD!");
            startActivity(startIntent);
        });

        // Attempting to launch an activity outside our app
        Button googleBtn = findViewById(R.id.googleBtn);

        googleBtn.setOnClickListener(v -> {
            String google = "http://www.google.com";
            Uri webAddr = Uri.parse(google);
            Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webAddr);

            // This always returns null, so...
            // if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
            //     startActivity(gotoGoogle);
            // }
            try {
                startActivity(gotoGoogle);
            } catch (Exception exception) {
                // Do nothing
            }
        });
    }
}