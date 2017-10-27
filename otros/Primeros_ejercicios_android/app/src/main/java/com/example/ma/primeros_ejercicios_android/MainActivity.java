package com.example.ma.primeros_ejercicios_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void lanzar_ejercicio1(View view){

        Intent intent = new Intent(this,Ejercicio1.class);
        this.startActivity(intent);


    }


    public void lanzar_jamassabre(View view){


        Intent intent = new Intent(this,CuentaGanadoViejo.class);
        this.startActivity(intent);


    }

    public void lanzar_ejercicio2(View view){


        Intent intent = new Intent(this,Cuenta_ganado.class);
        this.startActivity(intent);


    }



    public void relativeYbundle(View view){


        Intent intent = new Intent(this,RelativeLayoutYBundle.class);
        this.startActivity(intent);


    }



}
