package com.example.myproject;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReadyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready);
        Intent intent = getIntent();

        TextView textuser = findViewById(R.id.text_user);
        textuser.setText(" \n Are You Ready \n For Solve The Quiz ? ");


        Button buttonnew = findViewById(R.id.buttonnew);
        buttonnew.setOnClickListener(v->{
            Intent intent2 = new Intent(ReadyActivity.this , QuizActivity.class);
            startActivity(intent2);
        });
        ImageView img = findViewById(R.id.img);
        img.setOnClickListener(v->{
            Intent intent4 = new Intent(ReadyActivity.this , StartActivity.class);
            startActivity(intent4);
        });

    }
}