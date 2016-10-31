package com.example.asus.p2exer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sec_Act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_);
    }

    public void back(View v){
        EditText eTName = (EditText) findViewById(R.id.enter_name);
        EditText eTPNumber = (EditText) findViewById(R.id.enter_phone);
        String sName = eTName.getText().toString();
        String sPNumber = eTPNumber.getText().toString();
        Intent intentResult = new Intent();
        intentResult.putExtra("NAME", sName);
        intentResult.putExtra("P_NUMBER", sPNumber);
        setResult(2,intentResult);
        finish();
    }
}
