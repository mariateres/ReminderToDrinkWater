package com.example.newandroidapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2<dec> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         int glass=0;
    if(getIntent().hasExtra("com.example.newandroidapp.Something"))//checking for intent
        {
            TextView tv=(TextView)findViewById(R.id.textView3);//creating a text view object
            String text=getIntent().getExtras().getString("com.example.newandroidapp.Something");//obtaining the no of glasses set
            tv.setText(text + "Glasses");// setting the text view to no of glasses
            glass=getIntent().getExtras().getInt("com.example.newandroidapp.Something");
        }


    Button inc=(Button)findViewById(R.id.increase);
        int finalGlass = glass;
        inc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Runnable incrementer = new Runnable() {
                @Override
                public void run() {
                    increaseInt(finalGlass);
                    display(finalGlass);
                }
            };
            }
        });
    }
    Button decr=(Button)findViewById(R.id.decrease);

        decr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            incrementer=new Runnable(){
                @Override
                public void run() {
                    increaseInt(finalGlass);
                    display(finalGlass);
                }
            };
        }
    };


        int minteger=0;

        public void increaseInt (int view1){
            minteger=minteger+1;

        }
        public void decreaseInt (View view2){
            minteger=minteger-1;
            display(minteger);
        }
        private void display(int number)
        {
            TextView displayInteger=(TextView)findViewById(R.id.editTextNumber);
            displayInteger.setText(""+number);
        }
        }
    }
