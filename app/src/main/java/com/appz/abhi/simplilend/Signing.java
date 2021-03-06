package com.appz.abhi.simplilend;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Signing extends AppCompatActivity {

    ImageView imageView;
    RoundImage roundedImage;
    Button sign_in_btn, create_account_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing);

        imageView = findViewById(R.id.imageView);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.logo);
        roundedImage = new RoundImage(bm);
        imageView.setImageDrawable(roundedImage);

        sign_in_btn = findViewById(R.id.sign_in_btn_id);

        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Signing.this, HomeActivity.class));
            }
        });

        create_account_btn = findViewById(R.id.creat_account_btn_id);

        create_account_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Signing.this, CreateAccountActivity.class));
            }
        });
    }
}
