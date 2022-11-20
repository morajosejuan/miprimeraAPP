package com.serviciosikeo.primerapp;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalulcadoraSelectActivity extends AppCompatActivity {


    private EditText numUno;
    private EditText numDos;
    private TextView result;
    private Spinner listaroperaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calulcadora_select);

        numUno=(EditText)findViewById(R.id.editTextNum1);
        numDos=(EditText) findViewById(R.id.editTextNum2);
        result=(TextView)findViewById(R.id.textVerResultado);
        listaroperaciones=(Spinner)findViewById(R.id.spOperaciones);


    }

    public void operaciones(View view){
        int NumeroUno= parseInt(numUno.getText().toString());
        int NumeroDos= parseInt(numDos.getText().toString());
        int total;
        String operaciones =listaroperaciones.getSelectedItem().toString();

        if (operaciones.equals("Seleccione...")){
            total=0;
            result.setText(""+total);
        }else if(operaciones.equals("Sumar")){
            total=(NumeroUno+NumeroDos);
            result.setText(""+total);
        }else if(operaciones.equals("Restar")){
            total=(NumeroUno-NumeroDos);
            result.setText(""+total);
        }else if(operaciones.equals("Multiplicar")){
            total=(NumeroUno*NumeroDos);
            result.setText(""+total);
        }else {
            total=(NumeroUno/NumeroDos);
            result.setText(""+total);
        }


    }

    public void regresar (View view){
        Intent btnRegresarSelect =new Intent(CalulcadoraSelectActivity.this,IndexActivity.class);
        startActivity(btnRegresarSelect);

    }

}