package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        list = new ArrayList<>();
        list.add("가");
        list.add("나");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");
        list.add("가");

        // Header, Footer view 사용할 때 내용물이 꼭 있어야 붙는다
        // Header, Footer 가져오기
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View header = layoutInflater.inflate(R.layout.haeder_view,null,false);
        View footer = layoutInflater.inflate(R.layout.footer_view,null,false);

        listView.addHeaderView(header);
        listView.addFooterView(footer);

        // 어답터 연결
        final MyAdapter myAdapter = new MyAdapter(MainActivity.this, list);
        listView.setAdapter(myAdapter);

        // 헤더 클릭 시 2번째 요소 변경
        header.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                list.set(1, "가");

                // 어답터가 바라보는 리스트 값이 변경되면 갱신한다
                myAdapter.notifyDataSetChanged();
            }
        });

    }

    class MyAdapter extends BaseAdapter
    {
        private ViewHolder viewHolder;
        private LayoutInflater inflater;
        private ArrayList<String> itemList;

        public MyAdapter(Context context, ArrayList<String> itemList) {
            this.itemList = itemList;

            this.inflater =LayoutInflater.from(context);
        }

        // 내가 그릘 리스트 갯수
        @Override
        public int getCount() {
            return itemList.size();
        }

        // 리스트 아이템 가져옴
        @Override
        public String getItem(int position) {
            return itemList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;

            // 아무것도 없을 경우
            if(view == null)
            {
                viewHolder = new ViewHolder();
                view = inflater.inflate(R.layout.list_item_view, null);
                viewHolder.textView = view.findViewById(R.id.item_view_text);
                view.setTag(viewHolder);
            }

            // 있을 경우 저장
            else
            {
                viewHolder = (ViewHolder)view.getTag();
            }

            // 값을 채운다
            viewHolder.textView.setText(getItem(position));

            return view;
        }

        // 재활용되는 view 저장하는 클래스
        class ViewHolder
        {
            public TextView textView = null;
        }
    }
}
