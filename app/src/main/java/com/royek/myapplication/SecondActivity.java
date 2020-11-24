package com.royek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if(getIntent().hasExtra("com.royek.myapplication.SOMETHING")){
            TextView secactTextv = (TextView) findViewById(R.id.textView);
            String secText = getIntent().getExtras().getString("com.royek.myapplication.SOMETHING");
            secactTextv.setText(secText);
        }

        Button ggoglbuttn = (Button)findViewById(R.id.EnterGoogl);
        ggoglbuttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gogl = "http://www.google.com";
                Uri webgoogl = Uri.parse(gogl);
                Intent entergoogl = new Intent(Intent.ACTION_VIEW,webgoogl);
                if(entergoogl.resolveActivity(getPackageManager())!=null){
                    startActivity(entergoogl);
                }
            };

            //

        });
    }
}