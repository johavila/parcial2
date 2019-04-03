package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentList extends AppCompatActivity {

    private ListView ListView;
    private ArrayList<Student> Students;
    private ArrayList<String> StudentNote;
    private Intent In;
    private TextView TxtNoResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);

        ListView=(ListView)findViewById(R.id.ListOfStudents);
        TxtNoResults = (TextView)findViewById(R.id.TxtNoResult);
        Students = Data.Get();
        StudentNote = new ArrayList<String>();

        TxtNoResults.setVisibility(View.VISIBLE);
        ListView.setVisibility(View.INVISIBLE);

        if (Students.size() > 0){
            ListView.setVisibility(View.VISIBLE);
            TxtNoResults.setVisibility(View.INVISIBLE);

            for (int i = 0; i < Students.size() ; i++){
                StudentNote.add(Students.get(i).getName() + " " + Students.get(i).getLastName()+ " - "+getString(R.string.grade)+Students.get(i).getFinalGrade());
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, StudentNote);
        ListView.setAdapter(adapter);


        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                In = new Intent(StudentList.this, StudentDetail.class);
                In.putExtra("position", position);
                startActivity(In);
            }
        });

    }


}
