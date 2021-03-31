package com.example.pre_parcial;

import android.content.Intent;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Persona extends AppCompatActivity {

    private String name;
    private String lastName;
    private String email;
    private int age;
    private double salary;
    private String myPosition;

    public Persona(String name,String lastName,String email, int age,double salary, String myPosition){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public void listPeople(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMyPosition() {
        return myPosition;
    }

    public void setMyPosition(String myPosition) {
        this.myPosition = myPosition;
    }
}
