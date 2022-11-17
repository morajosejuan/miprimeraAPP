package com.serviciosikeo.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void saludo(View view){
        Intent salud = new Intent(IndexActivity.this,SaludoActivity.class);
        startActivity(salud);
    }

    public void calculadora(View view){
        Intent calc =new Intent(IndexActivity.this,CalculadoraActivity.class);
        startActivity(calc);
    }
    public void calculadoraLista(View view){
        Intent calclista =new Intent(IndexActivity.this,CalculaListaActivity.class);
        startActivity(calclista);
    }
}