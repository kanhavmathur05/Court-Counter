package com.example.kanhav.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0,scoreTeamB=0;
    TextView scoreA,scoreB;
    Button scoreA3,scoreA2,scoreAFT,scoreB3,scoreB2,scoreBFT,Reset;
    public void displayScoreA(int scoreOfA)
    {
        scoreA.setText(""+scoreOfA);
    }

    public void displayScoreB(int scoreOfB)
    {
        scoreB.setText(""+scoreOfB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //    final TextView scoreA=findViewById(R.id.scoreA);
    //    final TextView scoreB=findViewById(R.id.scoreB);
        scoreA=findViewById(R.id.scoreA);
        scoreB=findViewById(R.id.scoreB);
        scoreA3=findViewById(R.id.scoreAThree);
        scoreA2=findViewById(R.id.scoreATwo);
        scoreAFT=findViewById(R.id.freeThrowA);
        scoreB3=findViewById(R.id.scoreBThree);
        scoreB2=findViewById(R.id.scoreBTwo);
        scoreBFT=findViewById(R.id.freeThrowB);
        Reset=findViewById(R.id.reset);

        scoreA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=scoreTeamA+3;
                displayScoreA(scoreTeamA);
            }
        });
        scoreA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=scoreTeamA+2;
                displayScoreA(scoreTeamA);
            }
        });
        scoreAFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=scoreTeamA+1;
                displayScoreA(scoreTeamA);
            }
        });

        scoreB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB=scoreTeamB+3;
                displayScoreB(scoreTeamB);
            }
        });

        scoreB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB=scoreTeamB+2;
                displayScoreB(scoreTeamB);
            }
        });
        scoreBFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB=scoreTeamB+1;
                displayScoreB(scoreTeamB);
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA=0;
                scoreTeamB=0;
                displayScoreA(scoreTeamA);
                displayScoreB(scoreTeamB);
            }
        });

    }
}
