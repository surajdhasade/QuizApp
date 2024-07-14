package com.example.myproject;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Intent intent = getIntent();

        TextView textuser = findViewById(R.id.text_user);
        textuser.setText("Welcome \n Please Select Language \n\n------------------------\n\n स्वागत आहे  \n कृपया भाषा निवडा ");

        Button buttonnew = findViewById(R.id.buttonnew);
        buttonnew.setOnClickListener(v->{
            Intent intent2 = new Intent(StartActivity.this , ReadyActivity.class);
            startActivity(intent2);
        });
        Button marathi = findViewById(R.id.Marathi);
        marathi.setOnClickListener(v->{
            Intent intent3 = new Intent(StartActivity.this , ReadyActivity3.class);
            startActivity(intent3);
        });
        ImageView img = findViewById(R.id.img);
        img.setOnClickListener(v->{
            Intent intent4 = new Intent(StartActivity.this , MainActivity.class);
            startActivity(intent4);
        });

    }
}