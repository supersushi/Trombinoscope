package com.example.trombinoscope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_trombinoscope;
    Button btn_addPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_trombinoscope = (Button)findViewById(R.id.affichage);
        btn_trombinoscope.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(getApplicationContext(), "Affichage ok",Toast.LENGTH_LONG).show();
                        //Redirection vers affichage
                        Intent activityChangeIntent = new Intent(MainActivity.this, ListPersonActivity.class);
                        MainActivity.this.startActivity(activityChangeIntent);
                        ;                    }
                }
        );

        btn_addPerson = (Button) findViewById(R.id.ajout);
        btn_addPerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, AddPersonActivity.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }

}
