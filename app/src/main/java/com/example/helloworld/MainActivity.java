package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "Debug");
        Log.e(LOG_TAG, "Error");
        Log.w(LOG_TAG, "Warn");
        Log.i(LOG_TAG, "Info");
        Log.v(LOG_TAG, "Verbose");
    }
}