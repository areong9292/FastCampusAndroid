package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewOne;
    ImageView imageViewTwo;
    ImageView imageViewThree;
    ImageView imageViewFour;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        imageViewOne = findViewById(R.id.image_one);
        imageViewTwo = findViewById(R.id.image_two);
        imageViewThree = findViewById(R.id.image_three);
        imageViewFour = findViewById(R.id.image_four);


        // Glide로 이미지를 링크주소로 imageView에 가져옴
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .into(imageViewOne);

        RequestOptions cropOption = new RequestOptions().centerCrop();
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .apply(cropOption)
                .into(imageViewTwo);

        RequestOptions circleCrop = new RequestOptions().circleCrop();
        Glide.with(context)
                .load("https://laftelimage.blob.core.windows.net/items/thumbs/large/5ec987a2-8705-444d-a6d9-ff151f4edc92.jpg")
                .apply(circleCrop)
                .into(imageViewThree);

        Glide.with(context)
                .load(R.drawable.ic_launcher_background)
                .into(imageViewFour);
    }
}
