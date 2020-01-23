package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // 호출한 곳에서 보낸 데이터를 받는다
        Intent intent = getIntent();

        // 보낸 타입을 보고 맞는 메소드, 자료형 쓰면 됨
        // String data = intent.getStringExtra("INTENT_KEY");

        // int형은 이런 식으로 하면 INTENT_KEY를 int로 가져오는데 실패하면 0으로 가져올 수 있게 지정 가능
        int data = intent.getIntExtra("INTENT_KEY", 0);

        // string은 그런 거 없다
        String stringData = intent.getStringExtra("INTENT_KEY_STRING");

        Log.d("intent_key", "" + data);
        Log.d("intent_key_string", "" + stringData);
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
