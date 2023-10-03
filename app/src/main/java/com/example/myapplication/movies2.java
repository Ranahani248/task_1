package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class movies2 extends AppCompatActivity {
    public AppCompatButton appCompatButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies2);

        appCompatButton8 = findViewById(R.id.appCompatButton8);
              appCompatButton8.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Intent intent = new Intent(movies2.this, movies3.class);
                      startActivity(intent);
                  }
              });
    }
}