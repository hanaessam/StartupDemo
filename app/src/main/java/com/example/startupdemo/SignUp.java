package com.example.startupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.lastName);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.pass);
        DBHelper DB = new DBHelper(this);
        Button buttonReg = (Button) findViewById(R.id.buttonSignUp);
        buttonReg.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String fnameTXT = firstName.getText().toString();
                String lnameTXT = lastName.getText().toString();
                String emailTXT = email.getText().toString();
                String passTXT = password.getText().toString();
                Boolean checkinsertdata = DB.insertuserdata(fnameTXT, lnameTXT, emailTXT, passTXT);
                if(checkinsertdata==true)
                    Toast.makeText(SignUp.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SignUp.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();

                openMainActivity();
            }
        });



    }
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    }
