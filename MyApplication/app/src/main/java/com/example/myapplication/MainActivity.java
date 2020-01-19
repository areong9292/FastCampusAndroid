package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LifeCycle", "onCreate");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d("LifeCycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("LifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("LifeCycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("LifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("LifeCycle", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("LifeCycle", "onRestart");
    }
}
