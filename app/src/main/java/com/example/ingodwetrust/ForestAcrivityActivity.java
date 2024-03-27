package com.example.ingodwetrust;

import android.annotation.SuppressLint;
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
    private TextView wasdestroyed;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forest_acrivity);
        int count = CountSingleton.getInstance().getCount();
        int alls = CountSingleton.getInstance().getAllCount();

        Its = findViewById(R.id.youre_cruel);
        wasdestroyed = findViewById(R.id.allswasdestroyed);

//        int count = getIntent().getIntExtra("count", 0);

        Its.setText(count + " погибло из-за запуска модуля 'MagicWand'." +
                        "\nТесты показали, что вы 'Очень плохой человек'" +
                "\nЭто при учете, что мы на это даже не тестировали. Честно.");
        wasdestroyed.setText(alls + " bibis погибло за последние исследования. Вы агент Alt-bibis?");
    }
}