package com.example.a1210520_yara_khattab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        final EditText firstNameEditText = (EditText) findViewById(R.id.firstName);
        final EditText lastNameEditText = (EditText) findViewById(R.id.lastName);
        final Spinner genderSpinner = (Spinner) findViewById(R.id.genderSpinner);
        Button startGameButton = (Button) findViewById(R.id.startGameButton);


        String[] options = { "Choose your Gender", "Male", "Female" };
        ArrayAdapter<String> gender = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);
        gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(gender);


        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get user inputs
                String firstName = firstNameEditText.getText().toString().trim();
                String lastName = lastNameEditText.getText().toString().trim();
                String gender = genderSpinner.getSelectedItem().toString();


                Intent intent = new Intent(SignUpActivity.this, GameActivity.class);
                intent.putExtra("firstName", firstName);
                intent.putExtra("lastName", lastName);
                intent.putExtra("gender", gender);
                startActivity(intent);
                finish();
            }
        });
    }
}
