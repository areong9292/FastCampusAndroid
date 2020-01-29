package com.example.resource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 액티비티 가져오기 위함
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id로 뷰 컴포넌트 가져온다
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        imageView.setImageResource(R.drawable.dog1);
        textView.setText("안녕하세요");

        // value의 값도 가져올 수 있다
        String content = getApplicationContext().getResources().getString(R.string.long_text);
        textView.setText(content);

        // res에 정의 된 string-array 가져오기
        getApplicationContext().getResources().getStringArray(R.array.string_array);
        Log.d("string_array", getApplicationContext().getResources().getStringArray(R.array.string_array)[1]);
    }
}
