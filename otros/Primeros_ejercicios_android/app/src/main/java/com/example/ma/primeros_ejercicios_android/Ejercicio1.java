package com.example.ma.primeros_ejercicios_android;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio1 extends AppCompatActivity {


    public void miFuncion(View view) {

        String micadena = "";

        EditText miedittext = (EditText) findViewById(R.id.editText) ;
        micadena = miedittext.getText().toString();
        Toast.makeText(this,miedittext.getText().toString(),Toast.LENGTH_SHORT).show();
        Button button = (Button) view;
        button.setText(micadena);


    }


    public void miFuncionLimpiar (View view) {

        EditText miedittext = (EditText) findViewById(R.id.editText) ;
        miedittext.setText("");
    }



    ///overrides





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        Intent intent = getIntent();
        Toast.makeText(this,"Soy el metodo on create",Toast.LENGTH_LONG).show();
      }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"y yo el OnStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"soy el OnResume",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this,"soy el infiltrado PostResume",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"yo aparezco cuando se ejecuta on Pause",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"soy la ultima linea es onStop",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"se acabo todo, soy el metodo onDestroy y no me sobreviviran",Toast.LENGTH_LONG).show();

    }
}
