package com.example.matejapodravac.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
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

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
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
            });

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //lNaslov.add("Studenti");
        Student oStudent1 = new Student("Mateja", "Podravac");
        Student oStudent2 = new Student("Petar", "Mačinković");
        Naslov oNaslov = new Naslov("Studenti");
        //lStudenti.add(oStudent1);
        //lStudenti.add(oStudent2);
        myDataSet.add(oStudent1);
        myDataSet.add(oStudent2);
        myDataSet.add(oNaslov);

        //mAdapter = new MyRecyclerAdapter(lStudenti);
        //mAdapter = new MyRecyclerAdapter(lNaslov);
        mAdapter = new MyRecyclerAdapter(myDataSet);
        mRecyclerView.setAdapter(mAdapter);

    }

}
