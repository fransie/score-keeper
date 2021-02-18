package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int foulsTeamA = 0;
    int outsTeamA = 0;
    int inningsTeamA = 0;
    int foulsTeamB = 0;
    int outsTeamB = 0;
    int inningsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Resets all fouls, outs and innings to 0 and displays them.
     */
    public void resetAllValues(View view) {
        foulsTeamA = 0;
        outsTeamA = 0;
        inningsTeamA = 0;
        foulsTeamB = 0;
        outsTeamB = 0;
        inningsTeamB = 0;
        displayFoulsForTeamA(foulsTeamA);
        displayOutsForTeamA(outsTeamA);
        displayInningsForTeamA(inningsTeamA);
        displayFoulsForTeamB(foulsTeamB);
        displayOutsForTeamB(outsTeamB);
        displayInningsForTeamB(inningsTeamB);
    }

    /*
    ################################### CODE FOR TEAM A  ########################################
     */

    /**
     * Displays the given number of fouls for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of outs for Team A.
     */
    public void displayOutsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of innings for Team A.
     */
    public void displayInningsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_innings);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one foul to Team A's scores and displays updated number of fouls.
     */
    public void addFoulTeamA(View view) {
        foulsTeamA++;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Adds one out to Team A's scores and displays updated number of out.
     */
    public void addOutTeamA(View view) {
        outsTeamA++;
        displayOutsForTeamA(outsTeamA);
    }

    /**
     * Adds one inning to Team A's scores and displays updated number of innings.
     */
    public void addInningTeamA(View view) {
        inningsTeamA++;
        displayInningsForTeamA(inningsTeamA);
    }

    /*
    ################################### CODE FOR TEAM B  ########################################
     */

    /**
     * Displays the given number of fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of outs for Team B.
     */
    public void displayOutsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of innings for Team A.
     */
    public void displayInningsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_innings);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one foul to Team B's scores and displays updated number of fouls.
     */
    public void addFoulTeamB(View view) {
        foulsTeamB++;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Adds one out to Team A's scores and displays updated number of out.
     */
    public void addOutTeamB(View view) {
        outsTeamB++;
        displayOutsForTeamB(outsTeamB);
    }

    /**
     * Adds one inning to Team A's scores and displays updated number of innings.
     */
    public void addInningTeamB(View view) {
        inningsTeamB++;
        displayInningsForTeamB(inningsTeamB);
    }

}
