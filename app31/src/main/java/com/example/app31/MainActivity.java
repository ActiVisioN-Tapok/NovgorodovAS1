package com.example.app31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvTextView;
    ImageButton ibKitty;
    /*
    1. создадим id для компонента
    2. связать нашу переменную и id компонента
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTextView = findViewById(R.id.tvName);
        ibKitty = findViewById(R.id.KButton);
    }

    public void clickClick(View view){
        tvTextView.setText("Привет, Андрей!");
    }
}