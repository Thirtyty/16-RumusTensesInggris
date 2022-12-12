package com.example.a16rumustensesinggris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_tenses, btn_rumus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tenses = (Button) findViewById(R.id.btn_tenses);
        btn_rumus = (Button) findViewById(R.id.btn_rumus);

        btn_tenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActsatu = new Intent(getApplicationContext(), SvApaTenses.class);
                startActivity(BukaActsatu);
            }
        });
        btn_rumus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActDua = new Intent(getApplicationContext(), LvRumus.class);
                startActivity(BukaActDua);
            }
        });
    }
}