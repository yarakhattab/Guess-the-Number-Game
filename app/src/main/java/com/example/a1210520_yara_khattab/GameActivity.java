package com.example.a1210520_yara_khattab;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


public class GameActivity extends AppCompatActivity {

    private TextView guessNumber, welcomeText;
    private Button lowerButton, higherButton, equalButton;
    private int randomNumber, currentGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");


        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) firstName = "Player";


        welcomeText = findViewById(R.id.welcomeText);
        guessNumber = findViewById(R.id.guessNumber);
        lowerButton = findViewById(R.id.lowerButton);
        higherButton = findViewById(R.id.higherButton);
        equalButton = findViewById(R.id.equalButton);


        welcomeText.setText("Welcome, " + firstName + " " + lastName + "!");


        randomNumber = new Random().nextInt(100) + 1;


        currentGuess = 50;
        guessNumber.setText(String.valueOf(currentGuess));


        lowerButton.setOnClickListener(v -> {

            higherButton.setBackgroundColor(Color.parseColor("#6A4CAF"));
            equalButton.setBackgroundColor(Color.parseColor("#6A4CAF"));

            if (currentGuess > randomNumber) {
                currentGuess--;
                guessNumber.setText(String.valueOf(currentGuess));
                lowerButton.setBackgroundColor(Color.GREEN);
            } else {
                lowerButton.setBackgroundColor(Color.RED);
            }
        });

        higherButton.setOnClickListener(v -> {

            lowerButton.setBackgroundColor(Color.parseColor("#6A4CAF"));
            equalButton.setBackgroundColor(Color.parseColor("#6A4CAF"));

            if (currentGuess < randomNumber) {
                currentGuess++;
                guessNumber.setText(String.valueOf(currentGuess));
                higherButton.setBackgroundColor(Color.GREEN);
            } else {
                higherButton.setBackgroundColor(Color.RED);
            }
        });

        equalButton.setOnClickListener(v -> {

            lowerButton.setBackgroundColor(Color.parseColor("#6A4CAF"));
            higherButton.setBackgroundColor(Color.parseColor("#6A4CAF"));

            if (currentGuess == randomNumber) {
                equalButton.setBackgroundColor(Color.GREEN);

                Intent intent = new Intent(GameActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            } else {
                equalButton.setBackgroundColor(Color.RED);
            }
        });



    }
}
