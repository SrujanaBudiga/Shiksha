package com.example.shiksha;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button button2;
    private Button button6;
    private Button button7;
    private Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2 = findViewById(R.id.button2);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        getSupportActionBar().setTitle("CSE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        // String msg = intent.getStringExtra(MainActivity.mad);

        TextView textView =  findViewById(R.id.textview);
       /* button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openActivity1();
            }
        });*/
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openActivity6();
            }
        });
    }



    public void openActivity6(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}