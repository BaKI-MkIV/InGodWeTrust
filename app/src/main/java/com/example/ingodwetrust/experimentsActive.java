package com.example.ingodwetrust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class experimentsActive extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiments_active);

        // Прочитать содержимое первого файла
        String fileContent1 = readFile("aboutbibis/about_bibis.txt");

        // Прочитать содержимое второго файла
        String fileContent2 = readFile("aboutbibis/bibis-module.txt");

        // Прочитать содержимое третьего файла
        String fileContent3 = readFile("aboutbibis/alt-bibis.txt");

        // Найти TextView в макете
        TextView textView1 = findViewById(R.id.aboutBibis);
        TextView textView2 = findViewById(R.id.bibis_info);
        TextView textView3 = findViewById(R.id.alt);

        // Установить прочитанные данные в TextView
        textView1.setText(fileContent1);
        textView2.setText(fileContent2);
        textView3.setText(fileContent3);
    }

    // Метод для чтения содержимого файла
    private String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStream inputStream = getAssets().open(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
