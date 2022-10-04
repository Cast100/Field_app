package com.example.field.Adapters;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.field.R;

public class SoccerActivity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer);

        tvtitle = (TextView) findViewById(R.id.txtTitle);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        img = (ImageView) findViewById(R.id.thumbnail);

        // recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int Image = intent.getExtras().getInt("thumbnail");

        //setting value

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(Image);

    }
}
