package com.example.udmey.idioticquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class activity_aptitude extends AppCompatActivity {

    private activityQ mQuestion = new activityQ();
    private Button answer1, answer2, answer3, answer4;
    private TextView scoreview, questionview;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsNumber = 0;

    // updateQuestion();

    // ArrayList<Integer> used_index;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_aptitude);
        // Toast.makeText(this, "length " + mQuestionsLength, Toast.LENGTH_SHORT).show();

        answer1 = (Button) findViewById(R.id.bt);
        answer2 = (Button) findViewById(R.id.bt1);
        answer3 = (Button) findViewById(R.id.bt2);
        answer4 = (Button) findViewById(R.id.bt3);

        scoreview = (TextView) findViewById(R.id.t1);
        questionview = (TextView) findViewById(R.id.t2);
        updateQuestion();
        scoreview.setText("score:" + mScore);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // buttondisable();

                if (answer1.getText() == mAnswer) {
                    mScore++;
                    answer1.setBackgroundColor(Color.GREEN);
                    right();


                    // Toast.makeText()
                } else {
                    answer1.setBackgroundColor(Color.RED);
                    wrong();
                }
            }

        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    answer2.setBackgroundColor(Color.GREEN);
                    right();
                    // Toast.makeText()
                } else {
                    answer2.setBackgroundColor(Color.RED);
                    wrong();

                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer) {
                    mScore++;

                    answer3.setBackgroundColor(Color.GREEN);
                    right();
                } else {
                    answer3.setBackgroundColor(Color.RED);
                    wrong();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer) {
                    mScore++;


                    answer4.setBackgroundColor(Color.GREEN);
                    right();
                } else {
                    answer4.setBackgroundColor(Color.RED);
                    wrong();
                }
            }

        });


    }







    private void updateQuestion() {
        if (mQuestionsNumber<mQuestion.getLength()) {
            questionview.setText(mQuestion.getQuestion(mQuestionsNumber));
            answer1.setText(mQuestion.getChoice1(mQuestionsNumber));
            answer2.setText(mQuestion.getChoice2(mQuestionsNumber));
            answer3.setText(mQuestion.getChoice3(mQuestionsNumber));
            answer4.setText(mQuestion.getChoice4(mQuestionsNumber));

            mAnswer = mQuestion.getCorrectAnswer(mQuestionsNumber);
            mQuestionsNumber++;
        }
        else {
            // Toast.makeText(aptitude.this,"last aptitudeq",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(activity_aptitude.this,activity_result.class);
            intent.putExtra("score", mScore);
            startActivity(intent);
        }

    }


    private void updateScore(int point) {
        scoreview.setText("score:" + mScore);
        //  scoreview.setText("score:" + mScore+"/"+mQuestion.getLength());


    }


    public void updatecolor() {
        answer1.setBackgroundColor(Color.WHITE);
        answer2.setBackgroundColor(Color.WHITE);
        answer3.setBackgroundColor(Color.WHITE);
        answer4.setBackgroundColor(Color.WHITE);


    }

    public void right() {
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                updateScore(mScore);
                updatecolor();
                updateQuestion();

            }
        };
        handler.postDelayed(runnable, 2000);

    }


    public void wrong() {
        if (answer1.getText() == mAnswer) {
            answer1.setBackgroundColor(Color.GREEN);
        }
        if (answer2.getText() == mAnswer) {

            answer2.setBackgroundColor(Color.GREEN);
        }
        if (answer3.getText() == mAnswer) {

            answer3.setBackgroundColor(Color.GREEN);
        }
        if (answer4.getText() == mAnswer) {

            answer4.setBackgroundColor(Color.GREEN);
        }
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                updatecolor();
                updateQuestion();

            }
        };
        handler.postDelayed(runnable, 2000);


    }
 /*   public void buttondisable(){

        answer1.setEnabled(false);

        Timer buttonTimer1 = new Timer();
        buttonTimer1.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        answer1.setEnabled(true);
                    }
                });
            }
        }, 5000);

        answer2.setEnabled(false);

        Timer buttonTimer2 = new Timer();
        buttonTimer2.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        answer2.setEnabled(true);
                    }
                });
            }
        }, 5000);

        answer3.setEnabled(false);

        Timer buttonTimer3 = new Timer();
        buttonTimer3.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        answer3.setEnabled(true);
                    }
                });
            }
        }, 5000);

        answer4.setEnabled(false);

        Timer buttonTimer4 = new Timer();
        buttonTimer4.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        answer4.setEnabled(true);
                    }
                });
            }
        }, 5000);



    }*/



}
