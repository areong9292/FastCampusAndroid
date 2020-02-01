package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

// Fragment 클래스를 상속받아 이 클래스를 Fragment로 사용한다
public class FragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 이 클래스 fragment layout을 fragment_one으로 사용한다
        // inflate - xml을 view 객체로 만든다
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }
}
