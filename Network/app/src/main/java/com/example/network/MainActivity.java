package com.example.network;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 안드로이드 네트워크 라이브러리
        // Retrofit 객체 생성
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyService service = retrofit.create(MyService.class);

        // 인터페이스에서 지정한 타입과 똑같이 해야함
        // 통신 전송 준비 완료
        Call<JsonObject> requestUserRepo = service.getUseRepositories("areong9292");

        // 통신 전송
        // enqueue로 통신 시 비동기로 진행 됨
        requestUserRepo.enqueue(new Callback<JsonObject>()
        {
            // 응답 성공
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response)
            {

            }

            // 응답 실패
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t)
            {

            }
        });
    }
}
