package com.example.network;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.JsonObject;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    // Stetho Debugging address
    // chrome://inspect/#devices

    TextView textView1;
    TextView textView2;
    MyService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 네트워크 디버깅 라이브러리
        // Retrofit에 끼워넣어서 오고가는 패킷을 확인할 수 있다
        // 스테토 초기화
        Stetho.initializeWithDefaults(this);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();

        // 안드로이드 네트워크 라이브러리
        // Retrofit 객체 생성
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(MyService.class);

        // 텍스트뷰 클릭 때 통신하게 수정
        textView1 = findViewById(R.id.textview1);
        textView1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                requestRepo();
            }
        });

        // 텍스트뷰 클릭 때 통신하게 수정
        textView2 = findViewById(R.id.textview2);
        textView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                postUser();
            }
        });
    }

    public void postUser()
    {
        Call<JsonObject> postUser = service.postUser("areong9292", 20);
        postUser.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }

    public void requestRepo()
    {
        // 인터페이스에서 지정한 타입과 똑같이 해야함
        // 통신 전송 준비 완료
        Call<JsonObject> requestUserRepo = service.getUseRepositories("areong9292");

        // 통신 전송
        // enqueue로 통신 시 비동기로 진행 됨
        requestUserRepo.enqueue(new Callback<JsonObject>() {
            // 응답 성공
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

            }

            // 응답 실패
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }
}
