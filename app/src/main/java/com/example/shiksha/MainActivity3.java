package com.example.shiksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);

        getSupportActionBar().setTitle("ECE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        //   String msg = intent.getStringExtra(MainActivity.mad);

        button9.setOnClickListener(new View.OnClickListener() {
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