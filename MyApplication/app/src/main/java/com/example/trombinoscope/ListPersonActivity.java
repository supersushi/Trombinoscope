package com.example.trombinoscope;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.trombinoscope.DAO.PersonDAOData;



public class ListPersonActivity extends AppCompatActivity {
    TextView txt_listPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_person);

        txt_listPerson=(TextView)findViewById((R.id.ListPerson));
        PersonDAOData personDAOData = new PersonDAOData();
        String listPersons = personDAOData.getPerson().toString();

        txt_listPerson.append(listPersons);
    }

}
