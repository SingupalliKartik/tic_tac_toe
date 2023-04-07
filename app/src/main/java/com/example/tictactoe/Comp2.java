package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Comp2 extends AppCompatActivity {
    public static final String Extraname = "com.example.tictactoe.extra.name13";
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp2);
        getSupportActionBar().hide();



    }

    public void openActivity(View v) {
//        Toast.makeText(this, "Welcome Player", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Game2.class);
        text = findViewById(R.id.editTextTextPersonName);
        String name = text.getText().toString();
        intent.putExtra(Extraname, name);
        startActivity(intent);

    }
}