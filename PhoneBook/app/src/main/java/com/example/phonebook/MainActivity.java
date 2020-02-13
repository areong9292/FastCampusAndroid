package com.example.phonebook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LayoutInflater layoutInflater;

    // 리스트 그려질 linearLayout
    LinearLayout container;

    ArrayList<PhoneBook> phoneBookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        PhoneBook phoneBook1 = new PhoneBook(
                "https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg",
                "홍길동1",
                "010-0000-0001");

        PhoneBook phoneBook2 = new PhoneBook(
                "https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg",
                "홍길동2",
                "010-0000-0002");

        PhoneBook phoneBook3 = new PhoneBook(
                "https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg",
                "홍길동3",
                "010-0000-0003");

        PhoneBook phoneBook4 = new PhoneBook(
                "https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg",
                "홍길동4",
                "010-0000-0004");

        phoneBookList = new ArrayList<>();
        phoneBookList.add(phoneBook1);
        phoneBookList.add(phoneBook2);
        phoneBookList.add(phoneBook3);
        phoneBookList.add(phoneBook4);

        // inflater생성
        layoutInflater = LayoutInflater.from(MainActivity.this);

        for(int i = 0; i < phoneBookList.size(); i++)
        {
            // layout(xml) 가져와서 view 객체로 만듬
            View view = layoutInflater.inflate(R.layout.phone_book_item_view, null, false);

            TextView name = view.findViewById(R.id.name);
            TextView number = view.findViewById(R.id.number);
            ImageView imageView = view.findViewById(R.id.imageView);

            name.setText(phoneBookList.get(i).name);
            number.setText(phoneBookList.get(i).number);

            RequestOptions circleOption = new RequestOptions().circleCrop();
            Glide.with(MainActivity.this)
                    .load(phoneBookList.get(i).Image)
                    .apply(circleOption)
                    .into(imageView);

            final int finalI = i;
            view.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Log.d("test", phoneBookList.get(finalI).number);
                }
            });

            container.addView(view);
        }
    }
}
