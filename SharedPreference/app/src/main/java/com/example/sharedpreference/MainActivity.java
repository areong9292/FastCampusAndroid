package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String sharedPreferenceName = "SAVE_1";
        String sharedPreferenceKey = "KEY";

        // SharedPreference 생성
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPreferenceName, MODE_PRIVATE);

        // SharedPreference 데이터 변경, 추가, 삭제 등 편집을 할 수 있는 Editor 생성
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // 에디터에 데이터 넣기, 커밋까지 해야 적용된다
        // 다른 타입들도 있다
        editor.putString(sharedPreferenceKey, "안녕하세요");
        editor.commit();

        // SharedPreference의 데이터 삭제

        // 특정 키 삭제
        editor.remove(sharedPreferenceKey);

        // 전체 삭제
        editor.clear();
        editor.commit();

        // SharedPreference에서 데이터 불러오기
        String value = sharedPreferences.getString(sharedPreferenceKey, "실패");
        Log.d("test", "value : " + value);

        // 객체의 json화
        Person person = new Person("홍길동", 20);
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        Log.d("test","value : " + personJson);

        // 에디터에 json 넣음
        String sharedPreferencePersonKey = "person_key";
        editor.putString(sharedPreferencePersonKey, personJson);
        editor.commit();

        // json 가져온다
        String personString = sharedPreferences.getString(sharedPreferencePersonKey, "실패 2");

        // json을 다시 객체형으로 변환한다
        Person loadedPerson = gson.fromJson(personString, Person.class);
        Log.d("test","person age : " + loadedPerson.age);
    }
}