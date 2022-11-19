package com.example.bitcoin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText real, bit, dolar;
    private Button cotacoes, bpr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        real = findViewById(R.id.real);
        dolar = findViewById(R.id.dolar);
        bit = findViewById(R.id.bit);
        cotacoes = findViewById(R.id.cotacoes);
        bpr = findViewById(R.id.bpr);

        cotacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();
                alert.setTitle("Cotações");
                alert.setMessage("Selecione a opção");
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "Bitcoin para Real", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();

                    }
                });



                alert.show();
            }
        });

    }
}