package com.example.matejapodravac.myapplication;

import android.content.Intent;
import android.support.v4.os.IResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentInfoActivity extends AppCompatActivity {

    private Button oBtnUpisi;
    private EditText oInputPredmet;
    private String sPredmet;
    private String sIme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("ime");

        oInputPredmet = (EditText)findViewById(R.id.editPredmet);
        oBtnUpisi = (Button) findViewById(R.id.btnUpisi);

        oBtnUpisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sPredmet = oInputPredmet.getText().toString();
                Intent oUpisiPredmet=new Intent(getApplicationContext(), SummaryActivity.class);
                oUpisiPredmet.putExtra("ime", sIme);
                oUpisiPredmet.putExtra("predmet", sPredmet);
                startActivity(oUpisiPredmet);
            }
        });
    }
}
