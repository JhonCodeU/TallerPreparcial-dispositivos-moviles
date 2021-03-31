package com.example.pre_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtLastName;
    private EditText txtEmail;
    private EditText numberAge;
    private EditText numberSalary;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txtName = findViewById(R.id.txtName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);
        numberAge = findViewById(R.id.txtAge);
        numberSalary = findViewById(R.id.txtSalary);

        //btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnAdd){
            String name = txtName.getText().toString();
            String lastName = txtLastName.getText().toString();
            String email = txtEmail.getText().toString();
            int age = Integer.parseInt(numberAge.getText().toString());
            double salary = Double.parseDouble(numberSalary.getText().toString());

            Persona persona = new Persona(name,lastName,email,age,salary);
            persona.calcularJoventud();

            //Intent persona = new Intent(this, Persona.class);
            //persona.putExtra("namePerson", name);
            //persona.putExtra("lasNamePerson", lastName);
            //persona.putExtra("emailPerson", email);
            //persona.putExtra("agePerson", age);
            //persona.putExtra("salaryPerson", salary);
        }
    }
}