package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.chislo);
        text.setText("0");

        findViewById(R.id.buttonPlus).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView text = findViewById(R.id.chislo);
                        text.setText(String.valueOf(Integer.parseInt((String) text.getText()) + 1));
                    }
                }
        );

        findViewById(R.id.buttonMinus).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView text = findViewById(R.id.chislo);
                        text.setText(String.valueOf(Integer.parseInt((String) text.getText()) - 1));
                    }
                }
        );

        findViewById(R.id.buttonReset).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView text = findViewById(R.id.chislo);
                        text.setText("0");
                    }
                }
        );
    }
}