package com.example.laba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Обработка нажатия кнопки для груди
    public void handleClickChest(View view) {
        Intent intent = new Intent(this, ChosenTraining.class);
        intent.putExtra("chest", "Сегодня мы будем тренировать грудь!");
        startActivity(intent);
    }

    //Обработка нажатия кнопки для рук
    public void handleClickArms(View view) {
        Intent intent = new Intent(this, ChosenTraining.class);
        intent.putExtra("arms", "Сегодня мы будем тренировать руки!");
        startActivity(intent);
    }

    //Обработка нажатия кнопки для ног
    public void handleClickLegs(View view) {
        Intent intent = new Intent(this, ChosenTraining.class);
        intent.putExtra("legs", "Сегодня мы будем тренировать ноги!");
        startActivity(intent);
    }
}
