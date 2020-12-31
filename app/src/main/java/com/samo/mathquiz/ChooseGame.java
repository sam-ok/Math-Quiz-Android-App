package com.samo.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseGame extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_game);

    }

    public void addition(View v){
        Intent intent = new Intent(ChooseGame.this,MainActivity.class);
        startActivity(intent);
    }

    public void subtraction(View v){
        Intent intent = new Intent(ChooseGame.this,SubtractionActivity.class);
        startActivity(intent);
    }

    public void multiplication(View v){
        Intent intent = new Intent(ChooseGame.this,MultiplicationActivity.class);
        startActivity(intent);

    }

    public void division(View v){
        Intent intent = new Intent(ChooseGame.this,DivisionActivity.class);
        startActivity(intent);
    }

}