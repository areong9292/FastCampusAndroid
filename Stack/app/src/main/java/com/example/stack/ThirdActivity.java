package com.example.stack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("AGAIN", false);

        // 플래그 보냄
        // 메인 -> 세컨드 -> 서드 -> 메인 순인데
        // 메인 호출할 때 해당 플래그로 메인(젤 처음) 위의 모든 스택을 비운다
        // 그래서 메인만 남고 백버튼 누르면 바로 앱 종료됨
        intent.addFlags(FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
