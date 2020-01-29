package com.example.listener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 클릭 이벤트 리스너 등록
        // 텍스트 뷰 클릭 시 아래의 onClick 실행됨
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SecondActivity로 화면 전환
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        // 풀어서 쓴 것
        /*
        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // SecondActivity로 화면 전환
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        };
        textView.setOnClickListener(listener);
         */

        // EditText 이벤트 리스너
        editText = findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {

            // 텍스트가 변하기 전 호출
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("beforeTextChanged", "s : " + s);
                Log.d("beforeTextChanged", "start : " + start);
                Log.d("beforeTextChanged", "count : " + count);
                Log.d("beforeTextChanged", "after : " + after);
            }

            // 텍스트 변화 중 호출
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("onTextChanged", "s : " + s);
                Log.d("onTextChanged", "start : " + start);
                Log.d("onTextChanged", "before : " + before);
                Log.d("onTextChanged", "count : " + count);
            }

            // 사용자 입력 마친 후 호출
            @Override
            public void afterTextChanged(Editable s) {
                Log.d("afterTextChanged", "s : " + s);
            }
        });

        // 풀어서 쓴 것
        /*
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        editText.addTextChangedListener(textWatcher);
         */
    }
}
