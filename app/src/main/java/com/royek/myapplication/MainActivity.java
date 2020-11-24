package com.royek.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Add calculator
        Button addbtn= (Button) findViewById(R.id.IDButtonADD);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firsnum = (EditText) findViewById(R.id.IDNumber1);
                EditText Secnum = (EditText) findViewById(R.id.IDNumber2);
                TextView resTextV = (TextView) findViewById(R.id.IDRestextView);
                int num1 = Integer.parseInt(firsnum.getText().toString());
                int num2 = Integer.parseInt(Secnum.getText().toString());
                int Res = num1 + num2;
                resTextV.setText(Res+ "");

            }
        });

        //inside layout button(second Activity)
        Button SecACtivebtn= (Button) findViewById(R.id.IDSecActivity);
        SecACtivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent = new Intent(getApplicationContext(),SecondActivity.class);
                StartIntent.putExtra("com.royek.myapplication.SOMETHING","Search Option:");
                startActivity(StartIntent);

            }
        });
        //


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

       switch(id){
           case R.id.APP_INFO:
               Intent StartIntent = new Intent(getApplicationContext(),AppInfo.class);
               StartIntent.putExtra("com.royek.myapplication.TextAppInfo",
                       "Welcome to Roye's App:\n\nThis is expermintal app, used to learn the basic uses of android studio.\n\nenjoy :)");
               startActivity(StartIntent);
             /*  Toast.makeText(this,"Welcome to Roye's App:" +
                       "this is expermintal app,used to learn the basic uses of android studio." +
                       "enjoy :)",Toast.LENGTH_LONG).show();*/
               break;
           default: return true;
       }

        return true;
    }
}

