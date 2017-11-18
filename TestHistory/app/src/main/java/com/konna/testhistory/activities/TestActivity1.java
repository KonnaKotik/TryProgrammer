package com.konna.testhistory.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.konna.testhistory.R;
import com.konna.testhistory.objects.User;

/**
 * Created by Konna on 14.11.2017.
 */

public class TestActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_test1);

        final ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);
        button1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        button4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        button5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        button7.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        button9.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        button11.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        button13.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        button2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        button6.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        button8.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        button10.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        button12.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        button14.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
    }
}