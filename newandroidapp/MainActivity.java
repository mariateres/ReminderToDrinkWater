package com.example.newandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num=(EditText)findViewById(R.id.noOfGlasses);
        int val=Integer.parseInt(num.getText().toString());
        Button DoneBtn=(Button)findViewById(R.id.DoneBtn);//creating a button object
        DoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(getApplicationContext(),MainActivity2.class);//creating an intent
                startIntent.putExtra("com.example.newandroidapp.Something",val);//pass info to second activity(amount of water to be set)
                startActivity(startIntent);
            }
        });
    }
}