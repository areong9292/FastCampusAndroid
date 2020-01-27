package com.example.context;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 액티비티의 컨텍스트
        // MainActivity의 고유 값
        Context context = this;
        // == Context context2 = MainActivity.this;

        // 어플리케이션의 컨텍스트 - 더 큰 개념
        // 이 프로젝트(앱)의 고유 값
        Context applicationContext = getApplicationContext();
    }
}
