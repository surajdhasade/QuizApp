package com.example.myproject;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class QuizActivity2 extends AppCompatActivity {
    private TextView questiontext;
    private RadioGroup answersRadioGroup;
    private Button next_Button;
    private List<Question> questions;
    private int currentQuestionindex = 0;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);


        Intent intent = getIntent();

        questiontext = findViewById(R.id.questionText);
        answersRadioGroup = findViewById(R.id.answersRadioGroup);
            next_Button = findViewById(R.id.next_Button);
            next_Button.setText("पुढील प्रश्न ");


        questions = QuestionData2.get();

        loadQuestion(currentQuestionindex);


        next_Button.setOnClickListener(v->{
            checkAnswer();
            currentQuestionindex++;
            if (currentQuestionindex < questions.size()) {
                loadQuestion(currentQuestionindex);
                if (currentQuestionindex == questions.size()-1){
                    next_Button.setText("SUBMIT");
                }
            } else {
                displayScore();
            }
        });
    }

    private void loadQuestion(int questionIndex) {
        Question question = questions.get(questionIndex);
        questiontext.setText(question.getQuestionText());
        String[] options = question.getoptions();

        ((RadioButton) answersRadioGroup.getChildAt(0)).setText(options[0]);
        ((RadioButton) answersRadioGroup.getChildAt(1)).setText(options[1]);
        ((RadioButton) answersRadioGroup.getChildAt(2)).setText(options[2]);
        ((RadioButton) answersRadioGroup.getChildAt(3)).setText(options[3]);

        answersRadioGroup.clearCheck();
    }

    private void checkAnswer() {
        int selectedId = answersRadioGroup.getCheckedRadioButtonId();
        if (selectedId != 1) {
            RadioButton selectedRadioButton = findViewById(selectedId);
            int selectedIndex = answersRadioGroup.indexOfChild(selectedRadioButton);
            Question question = questions.get(currentQuestionindex);
            if (selectedIndex == question.getCorrectchoiceindex()) {
                score++;
            }
        }
    }

    private void displayScore() {

        Intent i = new Intent(QuizActivity2.this , ScoreActivity2.class);
        i.putExtra("score",score);
        i.putExtra("TOTAL_QUESTIONS", questions.size());
        startActivity(i);
        finish();
        Toast.makeText(this, "Scored Displayed ", Toast.LENGTH_LONG).show();
    }
}