package com.royek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AppInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);
        if(getIntent().hasExtra("com.royek.myapplication.TextAppInfo")){
            TextView iNfoTextv = (TextView) findViewById(R.id.textViewAppInfo);
            String infoText = getIntent().getExtras().getString("com.royek.myapplication.TextAppInfo");
            iNfoTextv.setText(infoText);
        }
    }
}