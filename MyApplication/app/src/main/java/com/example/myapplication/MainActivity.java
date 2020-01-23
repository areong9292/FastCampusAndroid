package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LifeCycle", "onCreate");

        /// 명시적 인텐트
        // 다른 액티비티 실행
        Intent intent = new Intent(this, SecondActivity.class);

        // 액티비티에 데이터를 보낸다
        intent.putExtra("INTENT_KEY", 5);

        intent.putExtra("INTENT_KEY_STRING", "STRING");
        // startActivity(intent); - 암시적 때문에 주석함

        /// 암시적 인텐트
        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
        startActivity(intent1);
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
