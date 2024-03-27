package com.example.ingodwetrust;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AfterDestroyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Находим кнопку второй активити
        Button returnButton = findViewById(R.id.savebutton);
        Button forest = findViewById(R.id.toforest);

        // Устанавливаем слушатель для кнопки
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // Создаем Intent для возвращения к предыдущей активити
                Intent intent = new Intent(AfterDestroyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        forest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Создаем Intent для возвращения к предыдущей активити
                Intent intent = new Intent(AfterDestroyActivity.this, ForestAcrivityActivity.class);
                startActivity(intent);
            }
        });
    }
}