package com.example.testintents1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txt1 = findViewById(R.id.txtNum1);
        EditText txt2 = findViewById(R.id.txtNum2);
        Button btnSoma = findViewById(R.id.btnSoma);
        Button btnSubtrair = findViewById(R.id.btnSubtrair);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);

        TextView txtResultado = findViewById(R.id.txtResultado);
        Button btnNovaTela = findViewById(R.id.btnNovaTela);

        btnNovaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActivityTela2.class);
                startActivity(i);

            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int num1 = Integer.parseInt(String.valueOf(txt1.getText())) ;
                int num2 = Integer.parseInt(String.valueOf(txt2.getText())) ;

                txtResultado.setText(String.valueOf(num1 + num2));
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(txt1.getText())) ;
                int num2 = Integer.parseInt(String.valueOf(txt2.getText())) ;

                txtResultado.setText(String.valueOf(num1 - num2));
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(txt1.getText())) ;
                int num2 = Integer.parseInt(String.valueOf(txt2.getText())) ;

                txtResultado.setText(String.valueOf(num1 / num2));
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(txt1.getText())) ;
                int num2 = Integer.parseInt(String.valueOf(txt2.getText())) ;

                txtResultado.setText(String.valueOf(num1 * num2));
            }
        });
    }
}