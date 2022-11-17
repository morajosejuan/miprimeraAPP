package com.serviciosikeo.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    private Button suma;
    private Button resta;
    private Button multipli;
    private Button divis;
    private EditText numUno;
    private EditText numDos;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        numUno=(EditText)findViewById(R.id.editNum1);
        numDos=(EditText) findViewById(R.id.editNum2);
        result=(TextView)findViewById(R.id.textResultado);
        suma=(Button)findViewById(R.id.btnSumar);
        resta=(Button) findViewById(R.id.btnRestar);
        multipli=(Button) findViewById(R.id.btnMultiplicar);
        divis=(Button) findViewById(R.id.btnDivision);


    }

    public void regresar (View view){
        Intent regresarcal =new Intent(CalculadoraActivity.this,IndexActivity.class);
            startActivity(regresarcal);

           }


    public void sumar(View view){
        int NumeroUno;
        int NumeroDos;
        int total;

        NumeroUno=Integer.parseInt(numUno.getText().toString());
        NumeroDos=Integer.parseInt(numDos.getText().toString());
        total=(NumeroUno+NumeroDos);
        result.setText(""+total);


    }

    public void restar(View view){
        int NumeroUno;
        int NumeroDos;
        int total;

        NumeroUno=Integer.parseInt(numUno.getText().toString());
        NumeroDos=Integer.parseInt(numDos.getText().toString());
        total=(NumeroUno-NumeroDos);
        result.setText(""+total);

    }

    public void multiplicar(View view){
        int NumeroUno;
        int NumeroDos;
        int total;

        NumeroUno=Integer.parseInt(numUno.getText().toString());
        NumeroDos=Integer.parseInt(numDos.getText().toString());
        total=(NumeroUno*NumeroDos);
        result.setText(""+total);

    }

    public void dividir(View view){
        int NumeroUno;
        int NumeroDos;
        int total;

        NumeroUno=Integer.parseInt(numUno.getText().toString());
        NumeroDos=Integer.parseInt(numDos.getText().toString());
        total=(NumeroUno/NumeroDos);
        result.setText(""+total);

    }



}