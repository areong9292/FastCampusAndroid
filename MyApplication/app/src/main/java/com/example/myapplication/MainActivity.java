package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int REQUEST_CODE = 1000;

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

        // 이렇게 하면 SecondActivity로 부터 result를 받을 수 있다
        startActivityForResult(intent, REQUEST_CODE);

        /// 암시적 인텐트
        // 인터넷 켤 수 있는 임의의 앱한테 보낸다
        // Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
        // startActivity(intent1);
    }

    // startActivityForResult로 결과값을 받기 위해선
    // 아래 메소드를 오버라이드 해야한다
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        // SecondActivity에서 요청한 RESULT_CODE가 맞는지 체크
        // 내가 보낸 intent에 대한 값이 맞는지 체크
        if(requestCode == REQUEST_CODE)
        {
            // 그 결과 코드가 200인 경우
            // 결과 값에 대한 액티비티 간의 약속
            if(resultCode == 200)
            {
                // 값 String 가져온다
                String result = data.getStringExtra("RESULT");

                Log.d("onActivityResult", "result : " + result);
            }

            // 300인 경우
            else if(resultCode == 300)
            {
                Log.d("onActivityResult", "result : " + "실패");
            }
        }
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
