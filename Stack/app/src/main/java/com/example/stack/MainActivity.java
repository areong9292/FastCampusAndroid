package com.example.stack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent comingIntent = getIntent();

        // 처음에는 디폴트 값 true여서 second 호출하고
        // third 통해서 오면 false를 받기 떄문에 안한다
        boolean again = comingIntent.getBooleanExtra("AGAIN", true);
        if(again == true)
        {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
