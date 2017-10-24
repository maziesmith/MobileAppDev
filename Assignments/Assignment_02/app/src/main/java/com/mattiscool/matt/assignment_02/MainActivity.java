package com.mattiscool.matt.assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Instantiating the quiz logic class.
    private QuizLogic quizLogic = new QuizLogic();

    //The UI elements of the app
    private TextView scoreView;
    private TextView questionPanel;
    private Button button01;
    private Button button02;
    private Button button03;


    private String question;
    private String answer;
    private int questionNumber = 0;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hooking everything up.
        scoreView = (TextView)findViewById(R.id.txtScoreCount);
        questionPanel = (TextView)findViewById(R.id.txtQuestionBox);
        button01 = (Button)findViewById(R.id.btn01);
        button02 = (Button)findViewById(R.id.btn02);
        button03 = (Button)findViewById(R.id.btn03);

        //Button01 Listener
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //Button02 Listener
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Button03 Listener
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }//End onCreate
}