package com.example.int26.segnapunti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int punteggioA = 0;
    int punteggioB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Tiro da 3A
     */

    public void tiro3A(View v) {

        displayForTeamA(punteggioA = punteggioA + 3);
    }

    /**
     * Tiro da 2A
     */
    public void tiro2A(View v) {

        displayForTeamA(punteggioA = punteggioA + 2);
    }

    /**
     * Tiro liberoA
     */
    public void liberoA(View v) {

        displayForTeamA(punteggioA = punteggioA + 1);

    }

    /**
     * Azzera il risultato
     */
    public void azzera(View v) {

        displayForTeamA(punteggioA = 0);
        displayForTeamB(punteggioB = 0);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int punteggio) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(punteggio));
    }


    /**
     * Tiro da 3B
     */

    public void tiro3B(View v) {

        displayForTeamB(punteggioB = punteggioB + 3);
    }

    /**
     * Tiro da 2B
     */
    public void tiro2B(View v) {

        displayForTeamB(punteggioB = punteggioB + 2);
    }

    /**
     * Tiro liberoB
     */
    public void liberoB(View v) {

        displayForTeamB(punteggioB = punteggioB + 1);

    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int punteggio) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(punteggio));
    }
}

