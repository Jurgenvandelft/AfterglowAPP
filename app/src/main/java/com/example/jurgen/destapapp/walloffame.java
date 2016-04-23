package com.example.jurgen.destapapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class walloffame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walloffame);
    }

    public void buttonOnClick(View v) {
        Intent newActivity = new Intent(walloffame.this, Hoofdscherm.class);
        startActivity(newActivity);
    }
}
