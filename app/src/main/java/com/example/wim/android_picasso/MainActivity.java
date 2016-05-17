package com.example.wim.android_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imgUrl, imgLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgUrl = (ImageView) findViewById(R.id.imgUrl);
        imgLocal = (ImageView) findViewById(R.id.imgLocal);

        // load image from URL
        Picasso.with(getApplicationContext())
                .load("https://3.bp.blogspot.com/-9AfabQFU368/VzsZndVnukI/AAAAAAAABrE/JXuInY2eJvw0dnqszEb85Nq-hdlzeoBFACKgB/s1600/13102516_264907107197324_1288967016_n.jpg")
                .placeholder(R.drawable.placeholder)
                .resize(800, 800)
                .centerCrop()
                .into(imgUrl);

        // load image
        Picasso.with(getApplicationContext())
                .load(R.drawable.yupi)
                .into(imgLocal);

    }
}
