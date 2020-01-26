package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 객체 생성 후 스레드 실행
        // 이 변수를 통해서 작업을 진행할 때 인스턴스 생성
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.d("runnable", "1");
            }
        };

        Thread thread = new Thread(runnable);

        // 실제 실행
        thread.start();*/

        // 그게 아니면 이렇게 그냥 실행
        new Thread(new Runnable() {
            @Override
            public void run() {
                // Log.d("runnable", "1");
            }
        }).start();

        // UI Thread 만드는 방법
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "토스트", Toast.LENGTH_LONG).show();
            }
        });
    }
}
