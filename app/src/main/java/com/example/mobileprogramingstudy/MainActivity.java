package com.example.mobileprogramingstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "JunTae's onCreate() called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "JunTae's onResume() called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "JunTae's onStart() called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "JunTae's onRestart() called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "JunTae's onStop() called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "JunTae's onPause() called!");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "JunTae's onDestroy() called!");
    }
}