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
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        String username = getIntent().getStringExtra("username");

        user = new User(this, username);

        Toast.makeText(this, user.getUsername(), Toast.LENGTH_SHORT).show();


        textView = (TextView) findViewById(R.id.textView2);
        Button1 = findViewById(R.id.Button1);
        Button2 = findViewById(R.id.Button2);
        Button3 = findViewById(R.id.Button3);
        Button4 = findViewById(R.id.Button4);

        View.OnClickListener OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenT = new Intent(MainActivity.this, TestActivity1.class);
                switch (view.getId()) {
                    case R.id.Button1:
                        startActivity(intenT);
                        break;
                    case R.id.Button2:
                        startActivity(intenT);
                        break;
                    case R.id.Button3:
                        startActivity(intenT);
                        break;
                    case R.id.Button4:
                        startActivity(intenT);
                        break;

                }
            }
        };
        Button1.setOnClickListener(OnClickListener);
        Button2.setOnClickListener(OnClickListener);
        Button3.setOnClickListener(OnClickListener);
        Button4.setOnClickListener(OnClickListener);
    }
}



