package com.example.addview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> stringList;
    LayoutInflater layoutInflater;

    // 리스트 그려질 linearLayout
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 리스트 뷰 만들 리스트
        stringList = new ArrayList();
        stringList.add("가");
        stringList.add("나");
        stringList.add("다");
        stringList.add("라");
        stringList.add("마");
        stringList.add("바");
        stringList.add("사");

        // linearLayout 가져옴
        container = findViewById(R.id.container);

        // inflater생성
        layoutInflater = LayoutInflater.from(MainActivity.this);

        View view;
        TextView itemText;

        for(int i = 0;i < stringList.size(); i++)
        {
            // layout(xml) 가져와서 view 객체로 만듬
            view = layoutInflater.inflate(R.layout.list_item_view, null, false);

            // view 객체에서 textview 가져옴
            itemText = view.findViewById(R.id.item_view_text);

            // textview에 리스트의 값을 적어준다
            itemText.setText(stringList.get(i));

            // view에 클릭 이벤트 추가
            view.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Log.d("test", "CLICK");
                }
            });

            // 작업 완료한 view를 container에 넣는다
            container.addView(view);
        }
    }
}
