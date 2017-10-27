package com.example.ma.primeros_ejercicios_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CuentaGanadoViejo extends AppCompatActivity {

    TextView hlMiTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_ganadoviejo);

        Intent intent = getIntent();


        hlMiTexto= (TextView) findViewById(R.id.contador);





    }


    public void sumar(View view){


        Integer nuevoValor =  Integer.parseInt( hlMiTexto.getText().toString()  )  + 1 ;
        hlMiTexto.setText(nuevoValor.toString());

    }



    public  void restar(View view){

        Integer nuevoValor =  Integer.parseInt( hlMiTexto.getText().toString()  )  - 1 ;
        hlMiTexto.setText(nuevoValor.toString());




    }
}
