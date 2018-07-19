package com.example.anmolbansal.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    private void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void twoPointer(View view) {
        scoreA=scoreA+2;
        display(scoreA);
    }


    public void threePointer(View view) {
        scoreA=scoreA+3;
        display(scoreA);
    }

    public void onePointer(View view) {
        scoreA=scoreA+1;
        display(scoreA);
    }

    private void display(int scoreA) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText(" "+scoreA);
    }

    public void twoPointerb(View view) {
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void threePointerb(View view) {
        scoreB=scoreB+3;
        displayB(scoreB);
    }

    public void onePointerb(View view) {
        scoreB=scoreB+1;
        displayB(scoreB);
    }

    private void displayB(int scoreB) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText(" "+scoreB);
    }

    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        display(scoreA);
        displayB(scoreB);
    }

    public void minus2(View view) {
        if (scoreA > 1) {
            scoreA = scoreA - 2;
        }else{
            return;
        }


        display(scoreA);
    }

    public void minus3(View view) {
        if (scoreA > 2) {
            scoreA = scoreA - 3;
        }else{
            return;
        }


        display(scoreA);
    }

    public void minus1(View view) {
        if (scoreA > 0) {
            scoreA = scoreA - 1;
        }else{
            return;
        }


        display(scoreA);
    }

    public void minus2B(View view) {
        if (scoreB > 1) {
            scoreB = scoreB - 2;
        }else{
            return;
        }


        displayB(scoreB);
    }

    public void minus3B(View view) {
        if (scoreB > 2) {
            scoreB = scoreB - 3;
        }else{
            return;
        }


        displayB(scoreB);
    }

    public void minus1B(View view) {
        if (scoreB > 0) {
            scoreB = scoreB - 1;
        }else{
            return;
        }


        displayB(scoreB);
    }
}

