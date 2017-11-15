package com.konna.testhistory.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.konna.testhistory.R;
import com.konna.testhistory.objects.User;

public class MainActivity extends AppCompatActivity {
    Button goButton;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        String username = getIntent().getStringExtra("username");

        user = new User(this, username);

        Toast.makeText(this, user.getUsername(), Toast.LENGTH_SHORT).show();


        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
    }
}



