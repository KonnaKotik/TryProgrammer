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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        String username = getIntent().getStringExtra("username");

        user = new User(this, username);

        Toast.makeText(this, user.getUsername(), Toast.LENGTH_SHORT).show();


        ageOneButton = (Button) findViewById(R.id.ageOneButton);

        ageOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.putExtra("age", "age1");
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



