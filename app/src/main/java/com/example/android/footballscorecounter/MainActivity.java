package com.example.android.footballscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.aScoreText);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bScoreText);
        scoreView.setText(String.valueOf(score));
    }

    public void scoredTouchDown(View view) {
        if (view == findViewById(R.id.aTouchdownButton)) {
            scoreTeamA += 6;
            displayForTeamA(scoreTeamA);
        } else scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    public void scoredPAT1(View view) {
        if (view == findViewById(R.id.aPAT1Button)) {
            scoreTeamA++;
            displayForTeamA(scoreTeamA);
        } else scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void scored2(View view) {
        if (view == findViewById(R.id.aPAT2Button) || view == findViewById(R.id.aSafetyButton)) {
            scoreTeamA += 2;
            displayForTeamA(scoreTeamA);
        } else scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void scoredFieldGoal(View view) {
        if (view == findViewById(R.id.aFieldGoalButton)) {
            scoreTeamA += 3;
            displayForTeamA(scoreTeamA);
        } else scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}