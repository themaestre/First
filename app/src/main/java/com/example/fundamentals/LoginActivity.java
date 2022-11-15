package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView img = findViewById(R.id.img);
        Glide.with(this)
                .load("https://fondosmil.com/fondo/5444.jpg")
                //.load(R.drawable.girl)
                .transition(DrawableTransitionOptions.withCrossFade(5000))
                .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.black)))
                .circleCrop()
                .into(img);
    }
    public void openMain(View v) {
        Intent intent = new Intent(this, SignupActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void openSignup(View v) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}