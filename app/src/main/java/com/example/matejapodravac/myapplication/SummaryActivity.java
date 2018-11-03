package com.example.matejapodravac.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private String ime;
    private String sPredmet;
    private TextView oIme;
    private TextView oPredmet;
    private Button oBtnPotvrdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        final Bundle oExtras=getIntent().getExtras();
        ime=oExtras.getString("ime");
        sPredmet=oExtras.getString("predmet");

        oIme=(TextView)findViewById(R.id.textViewIme);
        oIme.setText(ime);
        oPredmet=(TextView)findViewById(R.id.textViewPredmet);
        oPredmet.setText(sPredmet);

        oBtnPotvrdi = (Button)findViewById(R.id.btnPotvrdi);
        oBtnPotvrdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oPotvrdi=new Intent(getApplicationContext(), PersonalInfoActivity.class);
                startActivity(oPotvrdi);
            }
        });
    }
    @Override
    public void onBackPressed() {

    }
}
