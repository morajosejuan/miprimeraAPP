package com.serviciosikeo.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaludoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
    }

    public void regresar (View view){
        Intent regresarcal =new Intent(SaludoActivity.this,IndexActivity.class);
        startActivity(regresarcal);

    }


}