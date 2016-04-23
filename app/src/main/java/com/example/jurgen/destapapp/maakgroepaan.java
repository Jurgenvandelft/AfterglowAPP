package com.example.jurgen.destapapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class maakgroepaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maakgroepaan);
    }

    public void buttonOnClick(View v) {
        Intent newActivity = new Intent(maakgroepaan.this, Hoofdscherm.class);
        startActivity(newActivity);
    }

}
