package com.example.yersenhesapmakinesi;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText etNumber1, etNumber2;
    private TextView tvResult;
    private Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnClear;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        tvResult = findViewById(R.id.tvResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnClear = findViewById(R.id.btnClear);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etNumber1.getText().toString());
                double number2 = Double.parseDouble(etNumber2.getText().toString());
                double result = number1 + number2;
                tvResult.setText(String.valueOf(result));
            }
        });


        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etNumber1.getText().toString());
                double number2 = Double.parseDouble(etNumber2.getText().toString());
                double result = number1 - number2;
                tvResult.setText(String.valueOf(result));
            }
        });


        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etNumber1.getText().toString());
                double number2 = Double.parseDouble(etNumber2.getText().toString());
                double result = number1 * number2;
                tvResult.setText(String.valueOf(result));
            }
        });


        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(etNumber1.getText().toString());
                double number2 = Double.parseDouble(etNumber2.getText().toString());
                if (number2 == 0) {
                    tvResult.setText("Sıfıra bölünemez!");
                } else {
                    double result = number1 / number2;
                    tvResult.setText(String.valueOf(result));
                }
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNumber1.setText("");
                etNumber2.setText("");
                tvResult.setText("");
            }
        });
    }
}
