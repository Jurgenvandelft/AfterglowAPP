package com.example.jurgen.destapapp;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class zoekgebruikers extends Activity {

    private ListView lv;

    ArrayAdapter<String> adapter;

    EditText inputSearch;

    ArrayList<HashMap<String, String>> productList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoekgebruikers);

        String products[] = {"Nette", "Shane", "Nicky", "Bono", "Brecht",
                "Evy", "Nick",
                "Teun", "Eric", "Sam", "Roel"};

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        adapter = new ArrayAdapter<String>(this, R.layout.zoekmensen, R.id.naamgebruiker, products);
        lv.setAdapter(adapter);

    }

}
