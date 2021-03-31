package com.example.pre_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegister;
    private Button btnConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnRegister = findViewById(R.id.btnRegister);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnRegister.setOnClickListener(this);
        btnConsultar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnRegister){
            Intent i = new Intent(getApplicationContext(), Register.class);
            startActivity(i);
        }else if(v.getId() == R.id.btnConsultar){
            Intent i = new Intent(getApplicationContext(), consultar.class);
            startActivity(i);
        }
    }
}