package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Student> students = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.mobile_list);
        students.add(new Student("Sam", "Jenkins", "Computer Science"));
        students.add(new Student("Sam", "Croft", "Geology"));
        students.add(new Student("Walden", "Brown", "Political Science"));
        students.add(new Student("Sarrah", "George", "Marine Biology"));
        students.add(new Student("Will", "Jenkins", "Sports Management"));

        StudentAdapter adapter = new StudentAdapter(getApplicationContext(), students);

        listView.setAdapter(adapter);
    }
}
