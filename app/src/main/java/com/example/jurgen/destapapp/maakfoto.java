package com.example.jurgen.destapapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;

public class maakfoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maakfoto);
    }

    public void buttonOnClick(View v) {
        Intent newActivity = new Intent(maakfoto.this, Hoofdscherm.class);
        startActivity(newActivity);
    }
}
