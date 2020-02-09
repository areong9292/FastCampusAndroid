package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 키를 까먹거나 할 수 있으니 이렇게 적어놓고
    // 다른 곳에서는 import에서 사용하고 쓰면 된다
    public static final String BUNDLE_KEY = "bundle_key";

    FragmentManager fragmentManager;
    Button button;

    // 이렇게 Activity에서 Fragment를 등록하는 방법은
    // Fragment를 동적으로 사용하고자 할 때 좋다
    // Fragment를 붙혔다가 특정 조건 시 교체, 사라지게 하는 등의 작업
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // fragment 생성 시 값을 보내기 위해
        // 선언 따로 하고 bundle을 생성
        Fragment fragmentOne = new FragmentOne();
        Bundle bundle = new Bundle();

        // int형을 보낸다
        // 자료형 별로 있음
        bundle.putInt(BUNDLE_KEY, 10);

        // fragment에 번들을 보낸다
        fragmentOne.setArguments(bundle);

        // fragment를 제어하기 위한 매니저
        fragmentManager = getSupportFragmentManager();

        // Transaction - 액티비티에 적용한 각각의 변경 세트
        // FragmentTransaction - fragment 추가, 삭제, 교체 등의 작업
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // container에 FragmentOne을 넣는다
        // 이렇게 되면 FragmentOne이 새로 생성될 때 onCreateView가 실행되어
        // fragment_one xml의 view 객체가 생성되고
        // MainActivity의 xml인 activity_main의 container에 해당 view 객체가 들어가게 된다
        fragmentTransaction.add(R.id.container, fragmentOne); // 작업 1
        fragmentTransaction.commit(); // 확인

        // fragmentTransaction은 commit 후 재사용 불가

        // 버튼 이벤트 등록
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            // 버튼 클릭 시 fragmentone을 two로 교체한다
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, new FragmentTwo());
                fragmentTransaction.commit();
            }
        });
    }
}
