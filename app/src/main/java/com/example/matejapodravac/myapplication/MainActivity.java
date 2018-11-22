package com.example.matejapodravac.myapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
   //private ArrayList lStudenti = new ArrayList<>();
    //private List<String>lNaslov;

    private ArrayList myDataSet;
    private Student oStudent;
    private Naslov oNaslov;

    private Spinner spinner;
    private Button oBtnNoviStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setPrompt("Odaberite jezik");
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Jezici, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button oBtnNoviStudent = (Button) findViewById(R.id.novi_student);
        oBtnNoviStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oDodajNovogStudenta = new Intent(getApplicationContext(), PersonalInfoActivity.class);
                startActivity(oDodajNovogStudenta);
            }
            });*/

        RecyclerView mRecyclerView = findViewById(R.id.my_recycler_view);
        List<Object> studentList = generateList();
        InitializeRecyclerView(mRecyclerView, studentList);
    }

        List<Object> generateList()
        {
            List<Object> list=new ArrayList<>();
            list.add("Studenti");
            list.add(new Student("Mateja","Podravac"));
            list.add(new Student("Petar","Mačinković"));
            list.add(new Student("Ivan","Ivić"));
            list.add(new Student("Maja","Majić"));
            return list;
        }


    void InitializeRecyclerView(RecyclerView recyclerView, List<Object>studentList)
    {
        recyclerView.setAdapter(new MyRecyclerAdapter(studentList) {
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

}
