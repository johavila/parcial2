package com.example.parcial2;

import android.app.AppComponentFactory;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateStudent extends AppCompatActivity {

    private EditText Name, LastName, ID, GradeOne, GradeTwo, GradeThree;
    private Resources Resources;
    private ArrayList<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_student);

        Name = (EditText)findViewById(R.id.studentName);
        LastName = (EditText)findViewById(R.id.studentLastName);
        ID = (EditText)findViewById(R.id.studentID);
        GradeOne = (EditText)findViewById(R.id.studentGradeOne);
        GradeTwo = (EditText)findViewById(R.id.studentGradeTwo);
        GradeThree = (EditText)findViewById(R.id.studentGradeThree);

        Resources = this.getResources();
        students = Data.Get();
    }

    public void Save(View view){
        String NameV, LastNameV,  GradeOneV, GradeTwoV, GradeThreeV, IDV;
        IDV = ID.getText().toString();;
        NameV = Name.getText().toString();
        LastNameV = LastName.getText().toString();
        GradeOneV = GradeOne.getText().toString();
        GradeTwoV = GradeTwo.getText().toString();
        GradeThreeV = GradeThree.getText().toString();

        double GV1 = Double.parseDouble(GradeOneV), GV2 = Double.parseDouble(GradeTwoV), GV3 = Double.parseDouble(GradeThreeV);

        if((GV1 > 5.0 || GV1 < 0.0) || (GV2 > 5.0 || GV2 < 0.0) || (GV3 > 5.0 || GV3 < 0.0)){
            Toast.makeText(this, R.string.error, Toast.LENGTH_LONG).show();
        }else{
            Student S = new Student(NameV, LastNameV, IDV, GV1, GV2, GV3, (GV1+GV2+GV3)/3);
            S.SaveStudent();
            Toast.makeText(this, R.string.done, Toast.LENGTH_LONG).show();
        }
    }
}
