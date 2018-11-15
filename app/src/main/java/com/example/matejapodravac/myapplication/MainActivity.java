package com.example.matejapodravac.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Object> lStudenti = new ArrayList<>();
    private List<String>lNaslov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerAdapter(lStudenti);
        lNaslov.add("Studenti");
        Student oStudent1 = new Student("Mateja", "Podravac");
        Student oStudent2 = new Student("Petar", "Mačinković");
        lStudenti.add(oStudent1);
        lStudenti.add(oStudent2);
        mRecyclerView.setAdapter(mAdapter);
    }

}
