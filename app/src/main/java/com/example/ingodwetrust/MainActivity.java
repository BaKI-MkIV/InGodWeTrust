package com.example.ingodwetrust;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity /*implements fromHereToNotHere*/ {



    private TextView editText;
    private Button button;
    private Button button2;
    private Button buttonplusplus;
    private Button infobutton;
    private Button fragtest;
    private int count = 0;
    private String str;

//    @Override
//    public void onCountReceived(int count) {
//        Intent intent = new Intent(this, ForestAcrivityActivity.class);
//        intent.putExtra("count", count);
//        startActivity(intent); // Запускаем активити ForestAcrivityActivity
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Инициализируем views

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.buttonOne);
        button2 = findViewById(R.id.buttonTwo);
        buttonplusplus = findViewById(R.id.buttonOne2);
        infobutton = findViewById(R.id.infobutton);
        fragtest = findViewById(R.id.fragtest);
        str = " Bibis находится на рассмотрении";


        // Устанавливаем слушатель для первой кнопки
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                editText.setText(count + str);
            }
        });
        buttonplusplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count += 12;
                editText.setText(count + str);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //onCountReceived(count); // Вызываем метод для передачи count
                CountSingleton.getInstance().setCount(count);
                CountSingleton.getInstance().CountUpdate();
                Intent intent = new Intent(MainActivity.this, AfterDestroyActivity.class);
                startActivity(intent); // Запускаем активити AfterDestroyActivity
            }
        });

        infobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, experimentsActive.class);
                startActivity(intent); // Запускаем активити AfterDestroyActivity
            }
        });

        fragtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, its_activity_for_fragment.class);
                startActivity(intent);
            }
        });
    }
}