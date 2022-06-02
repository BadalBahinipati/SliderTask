package com.example.sliderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.login);

        //admin setup
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Slider.class);
                if(username.getText().toString().equals("android") && password.getText().toString().equals("172839")){
                    //correct
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                else{
                    //incorrect
                    Toast.makeText(MainActivity.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}