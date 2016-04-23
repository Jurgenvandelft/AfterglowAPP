package com.example.jurgen.destapapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class beheergroepen extends AppCompatActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hoofdscherm);

        listView = (ListView) findViewById(R.id.listView);

        String[] values = new String[] { "Carnavalsvereniging",
                "Slap Gezever",
                "PSV united",
                "Tilburg",
                "JRL",
                "Fontys",
                "Thuis",
                "Buitenland"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newaActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(newaActivity);
                        break;
                    case 2:
                        Intent newbActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(newbActivity);
                        break;
                    case 3:
                        Intent newcActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(newcActivity);
                        break;
                    case 4:
                        Intent newdActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(newdActivity);
                        break;
                    case 5:
                        Intent neweActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(neweActivity);
                        break;
                    case 6:
                        Intent newfActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(newfActivity);
                        break;
                    case 7:
                        Intent newgActivity = new Intent(beheergroepen.this, Hoofdscherm.class);
                        startActivity(newgActivity);
                        break;
                }
            }

        });

    }

}