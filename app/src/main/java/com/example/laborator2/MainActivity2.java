package com.example.laborator2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private String nr1;
    private String nr2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        nr1 = intent.getStringExtra("nr1");
        nr2 = intent.getStringExtra("nr2");
    }
//    public Intent intent = getIntent();
//    public Intent intent_1 = new Intent(this,MainActivity.class);
//    String nr1 = intent.getStringExtra("nr1");
//    String nr2 = intent.getStringExtra("nr2");

    public void onClickAdd(View view){

        int rez = Integer.parseInt(nr1) + Integer.parseInt(nr2);
        String rez1=Integer.toString(rez);

        Intent intent_1 = new Intent(this, MainActivity.class);
        intent_1.putExtra("rez",rez1);
        Toast.makeText(getApplicationContext(),"Opening activity2...",Toast.LENGTH_LONG).show();

        startActivity(intent_1);

    }

    public void onClickSub(View view){

        int rez = Integer.parseInt(nr1) - Integer.parseInt(nr2);
        String rez1=Integer.toString(rez);

        Intent intent_1 = new Intent(this,MainActivity.class);
        intent_1.putExtra("rez",rez1);
        Toast.makeText(getApplicationContext(),"Opening activity2...",Toast.LENGTH_LONG).show();

        startActivity(intent_1);
    }
}