package com.example.pre_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class consultar extends AppCompatActivity {

    private TextView TvResultJoven;
    private TextView TvResultVieja;
    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        personaMasJoven();
        TvResultJoven = findViewById(R.id.tvResultMasJoven);
        TvResultVieja = findViewById(R.id.tvPersonaVieja);
    }

    /*
    * cual es la persona mas joven
    */
    public void personaMasJoven(){
        //ArrayList listPeople = intent.getStringArrayListExtra("listPeople");
        //Serializable list = intent.getSerializableExtra("listPeople");
        /*for(int i=0; i< listPeople.size(); i++)
        {
            System.out.println(listPeople.get(i));
        }*/


    }
}