package com.example.myproject;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoretext , text2;
    private Button restartbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

//        int score = getIntent().getIntExtra("SCORE", 0);
//        int totalQuestions = getIntent().getIntExtra("TOTAL_QUESTIONS", 0);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score" , 0);
        int totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS" , 0);

        scoretext = findViewById(R.id.scoretext);
        restartbutton = findViewById(R.id.restartbutton);
        text2 = findViewById(R.id.text2);
        restartbutton.setText("Restart");
        scoretext.setText(" Score is : - "+ score + " / "+ totalQuestions);
        text2.setText("🙏🙏 Thank You 🙏🙏");

        restartbutton.setOnClickListener(v->{
            Intent i = new Intent(ScoreActivity.this ,StartActivity.class);
            startActivity(i);

        });

    }
}