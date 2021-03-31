package com.example.pre_parcial;

import android.content.Intent;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Persona extends AppCompatActivity {

    Intent intent = getIntent();

    private String name;
    private String lastName;
    private String email;
    private int age;
    private double salary;

    public Persona(String name,String lastName,String email, int age,double salary){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public void calcularJoventud(){
        if (age > 18){
            Log.d("Age","I am young");
        }
    }
}
