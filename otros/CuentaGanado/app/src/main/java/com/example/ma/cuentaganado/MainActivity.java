package com.example.ma.cuentaganado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hlMiTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
