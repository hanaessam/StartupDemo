package com.example.startupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button buttonLog = (Button) findViewById(R.id.buttonSignIn);
        Button buttonLog1 = (Button) findViewById(R.id.buttonSignUp);
        buttonLog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpActivity();
            }
        });
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }
    public void openSignUpActivity() {
        Intent intent2 = new Intent(this, SignUp.class);
        startActivity(intent2);
    }

    public void openMainActivity() {
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
}
    }
}