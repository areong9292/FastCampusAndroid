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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        ArrayList<String> list = new ArrayList<>();
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
        list.add("가");
        list.add("가");

        // 어답터 연결
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, list);
        listView.setAdapter(myAdapter);
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
