package com.example.field;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;

public class News_Recycler extends AppCompatActivity {

    TextView mtitle, mdescription;
    ImageView imgs;
    private AppBarLayout bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__recycler);

        //ActionBar bar = getSupportActionBar();
        Toolbar bar = findViewById(R.id.bars);

        bar.setTitle("Top News");
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        mdescription = (TextView) findViewById(R.id.viewtxt);
        imgs = (ImageView) findViewById(R.id.imgs);

        Intent i = getIntent();
        String mdes = i.getStringExtra("Description");

        byte[] mbytes = getIntent().getByteArrayExtra("image");
        //Bitmap bitmap = BitmapFactory.decodeByteArray(mbytes,0,mbytes.length);

    }
}
