package com.konna.testhistory.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.konna.testhistory.R;
import com.konna.testhistory.objects.User;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button ageOneButton;
    Button ageTwoButton;
    Button ageThreeButton;
    Button ageFourButton;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        String username = getIntent().getStringExtra("username");

        user = new User(this, username);

        Toast.makeText(this, user.getUsername(), Toast.LENGTH_SHORT).show();


        textView = (TextView) findViewById(R.id.textView2);
        ageOneButton = findViewById(R.id.ageOneButton);
        ageTwoButton = findViewById(R.id.ageTwoButton);
        ageThreeButton = findViewById(R.id.ageThreeButton);
        ageFourButton = findViewById(R.id.ageFourButton);

        View.OnClickListener OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenT1 = new Intent(MainActivity.this, TestActivity1.class);
                Intent intenT2 = new Intent(MainActivity.this, TestActivity2.class);
                Intent intenT3 = new Intent(MainActivity.this, TestActivity3.class);
                Intent intenT4 = new Intent(MainActivity.this, TestActivity4.class);
                switch (view.getId()) {
                    case R.id.ageOneButton:
                        startActivity(intenT1);
                        break;
                    case R.id.ageTwoButton:
                        startActivity(intenT2);
                        break;
                    case R.id.ageThreeButton:
                        startActivity(intenT3);
                        break;
                    case R.id.ageFourButton:
                        startActivity(intenT4);
                        break;

                }
            }
        };
        ageOneButton.setOnClickListener(OnClickListener);
        ageTwoButton.setOnClickListener(OnClickListener);
        ageThreeButton.setOnClickListener(OnClickListener);
        ageFourButton.setOnClickListener(OnClickListener);
    }
}



