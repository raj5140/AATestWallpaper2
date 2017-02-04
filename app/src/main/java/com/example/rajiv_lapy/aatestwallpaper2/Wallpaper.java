package com.example.rajiv_lapy.aatestwallpaper2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class Wallpaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        Bundle b = getIntent().getExtras();
        String image = b.getString("image");
        String name1 = b.getString("name");

//        Toast.makeText(getApplicationContext(), image, Toast.LENGTH_LONG).show();

        ImageView img = (ImageView) findViewById(R.id.img_page);
        Picasso.with(getBaseContext()).load(image).into(img);
    }
}
