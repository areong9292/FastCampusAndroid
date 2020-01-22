package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        Log.d("LifeCycle2", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("LifeCycle2", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("LifeCycle2", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("LifeCycle2", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("LifeCycle2", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("LifeCycle2", "onRestart");
    }
}
