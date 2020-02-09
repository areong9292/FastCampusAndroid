package com.example.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.fragment.MainActivity.BUNDLE_KEY;

// Fragment 클래스를 상속받아 이 클래스를 Fragment로 사용한다
public class FragmentOne extends Fragment {

    // Fragment가 view로 생성되고
    // 그 안에 버튼이 있기 때문에 전역으로 뺀다
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 이 클래스 fragment layout을 fragment_one으로 사용한다
        // inflate - xml을 view 객체로 만든다
        view = inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }

    // fragment에서 버튼 이벤트 리스너 등록은
    // onActivityCreated에서 하는 게 좋다
    // 버튼 클릭 시 액티비티 전환 등의 작업을 해야할 때
    // 액티비티 기능을 써야한다 -> 액티비티가 생성되어 있어야한다
    // 여기가 액티비티가 생성되어있는 것을 보장하기 때문
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        // MainActivity에서 보낸 bundle의 값을 가져온다
        int number = getArguments().getInt(BUNDLE_KEY);
        Log.d("test", "number : " + number);

        Button button = view.findViewById(R.id.fragment_one_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("test", "CLICK");
            }
        });
        super.onActivityCreated(savedInstanceState);
    }
}
