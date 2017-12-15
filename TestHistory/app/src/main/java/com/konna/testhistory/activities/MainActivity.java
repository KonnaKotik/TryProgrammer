package com.konna.testhistory.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.konna.testhistory.R;
import com.konna.testhistory.objects.User;

public class MainActivity extends AppCompatActivity {

    User user;

    Button ageOneButton;
    Button ageTwoButton;
    Button ageThreeButton;
    Button ageFourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        String username = getIntent().getStringExtra("username");

        user = new User(this, username);

        Toast.makeText(this, user.getUsername(), Toast.LENGTH_SHORT).show();


        ageOneButton = (Button) findViewById(R.id.ageOneButton);
        ageTwoButton = (Button) findViewById(R.id.ageTwoButton);
        ageThreeButton = (Button) findViewById(R.id.ageThreeButton);
        ageFourButton = (Button) findViewById(R.id.ageFourButton);


        ageOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("age", "age1");
                startActivity(intent);
            }
        });

        ageTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("age", "age2");
                startActivity(intent);
            }
        });

        ageThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("age", "age3");
                startActivity(intent);
            }
        });

        ageFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("age", "age4");
                startActivity(intent);
            }
        });

       /* goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });*/
    }
}



