package com.example.field;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;

public class Champ_win extends AppCompatActivity {

    TextView mtitle, mdescription;
    ImageView imgs;
    private AppBarLayout bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_win);

        Toolbar bar = findViewById(R.id.tool_bars);

        bar.setTitle("Top News");
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mtitle = (TextView) findViewById(R.id.viewtxt);
        mdescription = (TextView) findViewById(R.id.viewtxt2);
        imgs = (ImageView) findViewById(R.id.imgs);

        Intent i = getIntent();
        String mdes = i.getStringExtra("Description");
        byte[] mbytes = getIntent().getByteArrayExtra("image");

    }
}
