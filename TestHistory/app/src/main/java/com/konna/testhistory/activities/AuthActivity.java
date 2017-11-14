package com.konna.testhistory.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.konna.testhistory.R;

/**
 * Created by Konna on 14.11.2017.
 */

public class AuthActivity extends AppCompatActivity {

    EditText usernameEditText;
    Button goButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_auth);

        usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        goButton = (Button) findViewById(R.id.goButton);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = usernameEditText.getText().toString();

                if (username.length() > 0) {
                    Intent intent = new Intent(AuthActivity.this, MainActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(AuthActivity.this, "Заполните поля с именем", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
