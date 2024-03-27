package com.example.ingodwetrust;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;

public class ForestAcrivityActivity extends AppCompatActivity {

    private TextView Its;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forest_acrivity);

        Its = findViewById(R.id.youre_cruel);

        int count = getIntent().getIntExtra("count", 0);

        Its.setText(count + " bibis died by your hands. \nTests show that you are a very bad " +
                "person. \nAt the same time, we didn’t even test for this.");
    }
}