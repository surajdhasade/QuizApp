package com.example.myproject;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity2 extends AppCompatActivity {

    private TextView scoretext , text2;
    private Button restartbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        restartbutton = findViewById(R.id.restartbutton);
        restartbutton.setText("पुन्हा सुरू करा ");


//        int score = getIntent().getIntExtra("SCORE", 0);
//        int totalQuestions = getIntent().getIntExtra("TOTAL_QUESTIONS", 0);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score" , 0);
        int totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS" , 0);

        scoretext = findViewById(R.id.scoretext);
        restartbutton = findViewById(R.id.restartbutton);
        text2 = findViewById(R.id.text2);
        scoretext.setText(" गुण  : - "+ score + " / "+ totalQuestions);
        text2.setText(" 🙏🙏  धन्यवाद   🙏🙏 ");

        restartbutton.setOnClickListener(v->{
            Intent i = new Intent(ScoreActivity2.this ,StartActivity.class);
            startActivity(i);

        });

    }
}