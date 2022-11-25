package com.example.laborator2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        TextView rez = findViewById(R.id.Rez);
        String txt=intent.getStringExtra("rez");
        System.out.println(txt);
        rez.setText(txt);
    }
    public void onClickOp(View view){
        EditText nr1 = findViewById(R.id.nr1);//aici cred ca iau doar dupa id .. nu si contextul
        EditText nr2 = findViewById(R.id.nr2);

        if((TextUtils.isEmpty(nr1.getText().toString())) || TextUtils.isEmpty(nr2.getText().toString())){
            Toast.makeText(getApplicationContext(),"Lipsesc numerele", Toast.LENGTH_LONG).show();
        }else
        {
            Intent intent_2 = new Intent(this,MainActivity2.class);
            Toast.makeText(getApplicationContext(),"Opening activity1...",Toast.LENGTH_LONG).show();
            intent_2.putExtra("nr1",nr1.getText().toString());
            intent_2.putExtra("nr2",nr2.getText().toString());


            startActivity(intent_2);
        }

    }

}