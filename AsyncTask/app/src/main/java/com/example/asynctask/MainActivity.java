package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("test", "PRE!!");

        // AsyncTask 실행
        BackgroundTask backgroundTask = new BackgroundTask();
        backgroundTask.execute();

        // AsyncTask는 스레드로 작동하므로
        // 하단의 코드가 바로 실행됨
        Log.d("test", "POST!!");
    }

    class BackgroundTask extends AsyncTask<Integer, Integer, Integer>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d("test", "onPreExecute");
        }

        // AsyncTask는 doInBackground를 반드시 override 해야함
        // 자료형...은 해당 자료형 변수가 몇 개 올지 모른다는 뜻
        @Override
        protected Integer doInBackground(Integer... integers) {

            int result = 0;
            for(int i = 0; i < 100; i++)
            {
                result++;
                if(i % 10 == 0)
                {
                    // onProgressUpdate를 호출한다
                    publishProgress(i);
                }
            }

            // onPostExecute 호출되며 그 인자로 리턴 값을 넘긴다
            return result;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            Log.d("test", "Progress : " + values[0] + "%");
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            Log.d("test", "result : " + integer);
        }
    }
}