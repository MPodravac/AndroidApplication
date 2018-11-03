package com.example.matejapodravac.myapplication;

import android.content.Intent;
import android.support.v4.os.IResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalInfoActivity extends AppCompatActivity {

    private Button oBtnUnesi;
    private EditText oInputIme;
    private String sIme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        oInputIme=(EditText)findViewById(R.id.editIme);
        oBtnUnesi=(Button)findViewById(R.id.button3);

        oBtnUnesi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sIme = oInputIme.getText().toString();
                Intent oUpisiIme = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oUpisiIme.putExtra("ime", sIme);
                startActivity(oUpisiIme);
            }

        });
    }
}
