package com.example.myproject;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject.QuizActivity;
import com.example.myproject.R;

public class ReadyActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready3);
        Intent intent = getIntent();

        TextView textuser = findViewById(R.id.text_user);
        textuser.setText(" \n तुम्ही तयार आहात का \n प्रश्नमंजूषा सोडवण्यासाठी ? ");

        Button buttonnew = findViewById(R.id.buttonnew);
        buttonnew.setOnClickListener(v->{
            Intent intent2 = new Intent(com.example.myproject.ReadyActivity3.this , QuizActivity2.class);
            startActivity(intent2);
        });
        ImageView img = findViewById(R.id.img);
        img.setOnClickListener(v->{
            Intent intent4 = new Intent(ReadyActivity3.this , StartActivity.class);
            startActivity(intent4);
        });

    }
}