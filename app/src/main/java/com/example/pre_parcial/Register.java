package com.example.pre_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Iterator;

public class Register extends AppCompatActivity implements View.OnClickListener{

    private EditText txtName;
    private EditText txtLastName;
    private EditText txtEmail;
    private EditText numberAge;
    private EditText numberSalary;
    private Spinner spinnerCargo;
    private Button btnAdd;
    ArrayList<Persona> people =new ArrayList<Persona>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        txtName = findViewById(R.id.txtName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);
        numberAge = findViewById(R.id.txtAge);
        numberSalary = findViewById(R.id.txtSalary);
        spinnerCargo = (Spinner)findViewById(R.id.spinnerCargo);

        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnAdd){
            String name = txtName.getText().toString();
            String lastName = txtLastName.getText().toString();
            String email = txtEmail.getText().toString();
            int age = Integer.parseInt(numberAge.getText().toString());
            double salary = Double.parseDouble(numberSalary.getText().toString());
            String myPosition = spinnerCargo.getSelectedItem().toString();

            Persona persona = new Persona(name,lastName,email,age,salary, myPosition);
            people.add(persona);

            //Getting Iterator
            Iterator itr = people.iterator();
            //traversing elements of ArrayList object

            while(itr.hasNext()){
                Persona st= (Persona)itr.next();
                System.out.println(st.getName()+" "+st.getLastName()+" "+st.getEmail());
            }

            Intent intel = new Intent(this, consultar.class);
            intel.putExtra("listPeople", people);
            //persona.putExtra("lasNamePerson", lastName);
            //persona.putExtra("emailPerson", email);
            //persona.putExtra("agePerson", age);
            //persona.putExtra("salaryPerson", salary);

        }

    }
}