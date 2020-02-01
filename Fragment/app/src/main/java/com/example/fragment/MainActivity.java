package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // fragment를 제어하기 위한 매니저
        fragmentManager = getSupportFragmentManager();

        // Transaction - 액티비티에 적용한 각각의 변경 세트
        // FragmentTransaction - fragment 추가, 삭제, 교체 등의 작업
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // container에 FragmentOne을 넣는다
        // 이렇게 되면 FragmentOne이 새로 생성될 때 onCreateView가 실행되어
        // fragment_one xml의 view 객체가 생성되고
        // MainActivity의 xml인 activity_main의 container에 해당 view 객체가 들어가게 된다
        fragmentTransaction.add(R.id.container, new FragmentOne()); // 작업 1
        fragmentTransaction.commit(); // 확인

    }
}
