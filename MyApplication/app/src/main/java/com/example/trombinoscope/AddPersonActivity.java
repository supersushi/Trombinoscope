package com.example.trombinoscope;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trombinoscope.DAO.IPersonDAO;
import com.example.trombinoscope.DTO.Person;
import com.example.trombinoscope.DAO.PersonDAOData;

public class AddPersonActivity extends AppCompatActivity {
    private static final String TAG = "AddPersonActivity";

    EditText    prenom;
    EditText    nom;
    Button      btnAddPerson;
    IPersonDAO personDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        personDAO   =new PersonDAOData();
        setContentView(R.layout.activity_add_person);
        prenom = (EditText) findViewById(R.id.input_lastnameadd);
        nom  = (EditText) findViewById(R.id.input_firstnameadd);
        btnAddPerson = (Button) findViewById(R.id.btn_addperson);
        btnAddPerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Person person  =new Person(prenom.getText().toString(), nom.getText().toString(), Color.BLACK);
                personDAO.addPerson(person);
                Toast.makeText(getApplicationContext(), "Une personne a été ajoutée ! " + person, Toast.LENGTH_LONG).show();
                prenom.setText("");
                nom.setText("");
            }
        });
    }



}
