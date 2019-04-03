package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentDetail extends AppCompatActivity {

    private Intent In;
    private ArrayList<Student> Students;
    private TextView Name, ID, NoteOne, NoteTwo, NoteThree, FinalNote;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_detail);

        In = getIntent();
        Students=Data.Get();

        int Position = In.getIntExtra("position", 0);

        Name = (TextView)findViewById(R.id.StudentNameLastName);
        ID = (TextView)findViewById(R.id.StudentID);
        NoteOne = (TextView)findViewById(R.id.StudentNoteOne);
        NoteTwo = (TextView)findViewById(R.id.StudentNoteTwo);
        NoteThree = (TextView)findViewById(R.id.StudentNoteThree);
        FinalNote = (TextView)findViewById(R.id.StudentFinalNote);

        loadData(Students.get(Position));

    }

    private void loadData(Student Student){
        Name.setText(getString(R.string.name)+": "+Student.getName() + " " + Student.getLastName());
        ID.setText(getString(R.string.id)+": "+Student.getID());
        NoteOne.setText(getString(R.string.grade_one)+": "+Double.toString(Student.getGradeOne()));
        NoteTwo.setText(getString(R.string.grade_two)+": "+Double.toString(Student.getGradeTwo()));
        NoteThree.setText(getString(R.string.grade_three)+": "+Double.toString(Student.getGradeThree()));
        FinalNote.setText(getString(R.string.final_grade)+": "+Double.toString(Student.getFinalGrade()));

    }
}
