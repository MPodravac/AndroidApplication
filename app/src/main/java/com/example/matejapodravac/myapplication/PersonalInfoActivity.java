package com.example.matejapodravac.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
    }

    public void BtnClick(View view) {
        startActivity(new Intent(PersonalInfoActivity.this, StudentInfoActivity.class));
    }


}
