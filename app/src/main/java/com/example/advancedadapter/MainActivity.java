package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student studentOne = new Student("Chayana","Stefania","The BOSS");
        Student studentTwo = new Student("Bajar","Abajo","Computer Science");
        Student studentThree = new Student("Stephanie","De Los Santos","Computer Science");
        Student studentFour = new Student("The More","Better","Computer Science");
        Student studentFive = new Student("Subir","Arriba","Computer Science");

        studentArrayList.add(studentOne);
        studentArrayList.add(studentTwo);
        studentArrayList.add(studentThree);
        studentArrayList.add(studentFour);
        studentArrayList.add(studentFive);

        StudentAdapter studentAdapter = new StudentAdapter(getApplicationContext(), studentArrayList);

        ListView listView = findViewById(R.id.student);
        listView.setAdapter(studentAdapter);
    }

}
