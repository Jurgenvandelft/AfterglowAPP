package com.example.jurgen.destapapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Hoofdscherm extends AppCompatActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hoofdscherm);

        listView = (ListView) findViewById(R.id.listView);

        String[] values = new String[] { "Maak een groep aan",
                "Beheer groepen",
                "Zoek gebruikers",
                "Maak foto",
                "Upload foto",
                "Chat",
                "Wall of fame",
                "Wall of shame"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(Hoofdscherm.this, maakgroepaan.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newaActivity = new Intent(Hoofdscherm.this, beheergroepen.class);
                        startActivity(newaActivity);
                        break;
                    case 2:  Intent newbActivity = new Intent(Hoofdscherm.this, zoekgebruikers.class);
                        startActivity(newbActivity);
                        break;
                    case 3:  Intent newcActivity = new Intent(Hoofdscherm.this, maakfoto.class);
                        startActivity(newcActivity);
                        break;
                    case 4:  Intent newdActivity = new Intent(Hoofdscherm.this, uploadfoto.class);
                        startActivity(newdActivity);
                        break;
                    case 5:  Intent neweActivity = new Intent(Hoofdscherm.this, chat.class);
                        startActivity(neweActivity);
                        break;
                    case 6:  Intent newfActivity = new Intent(Hoofdscherm.this, walloffame.class);
                        startActivity(newfActivity);
                        break;
                    case 7:  Intent newgActivity = new Intent(Hoofdscherm.this, wallofshame.class);
                        startActivity(newgActivity);
                        break;
                }
            }

        });

    }

}

