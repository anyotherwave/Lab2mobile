package com.example.laba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChosenTraining extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_training);

        TextView textView = findViewById(R.id.chosenTraining);
        Bundle arguments = getIntent().getExtras(); //запрашиваем даннные из интентов
        if(arguments.get("chest")!=null) //проверяем в каком из вариантов присутсвуют данные
            textView.setText(arguments.get("chest").toString());
        else if(arguments.get("arms")!=null)
            textView.setText(arguments.get("arms").toString());
        else textView.setText(arguments.get("legs").toString());
    }

    //обработка кнопки поделится
    public void shareTraining(View view) {

        //создание неявного интента для заполнения данных
        Intent i = new Intent(Intent.ACTION_SEND);

        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,"Моя тренировка");
        i.putExtra(Intent.EXTRA_TEXT, "Сегодня я буду тренироваться");

        startActivity(i);
    }
}
