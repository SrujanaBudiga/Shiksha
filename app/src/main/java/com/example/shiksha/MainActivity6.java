package com.example.shiksha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {
    //   public static final String mad = "com.example.myapplication.MADHU";
    private Button button9;
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        getSupportActionBar().setTitle("SEMESTER 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        //    String msg = intent.getStringExtra(MainActivity6.mad);

        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openActivity8();
            }
        });
    }



    public void openActivity7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void openActivity8(){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}