package com.example.asus.p2exer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDial(View v){
        TextView editText = (TextView) findViewById(R.id.phone_number);
        String p_number = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: \""+ p_number+"\""));
        startActivity(intent);
    }

    public void showDialer(View v){
        Intent intent = new Intent(this, Sec_Act.class);
        startActivityForResult(intent,2);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==2){
            if(null!=data){
                String name = data.getStringExtra("NAME");
                String p_number = data.getStringExtra("P_NUMBER");

                TextView showName = (TextView) findViewById(R.id.name);
                TextView showP_Number = (TextView) findViewById(R.id.phone_number);
                showName.setText("Name :"+ name);
                showP_Number.setText(p_number);
            }
        }
    }
}
