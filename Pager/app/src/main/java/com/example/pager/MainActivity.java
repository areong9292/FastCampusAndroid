package com.example.pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml에서 찾아옴
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        // 탭 만들기 + 이름 지정
        tabLayout.addTab(tabLayout.newTab().setText("ONE"));
        tabLayout.addTab(tabLayout.newTab().setText("TWO"));
        tabLayout.addTab(tabLayout.newTab().setText("THREE"));

        // 어답터 지정
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 3);
        viewPager.setAdapter(pagerAdapter);

        // 탭과 뷰 페이저 연결

        // 탭 레이아웃에 탭이 선택되었을 때의 이벤트를 연결한다
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            // 탭이 선택되었을 때
            public void onTabSelected(TabLayout.Tab tab) {
                // 뷰페이저의 현재 아이템을 텝의 포지션번째 아이템으로 지정한다
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            // 탭이 선택 안되었을 때
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            // 탭이 다시 선택되었을 때
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        // 뷰 페이저 변경 시 텝도 적용되게 이벤트 연결
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
