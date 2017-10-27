package com.example.ma.textinputlayout;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hlmiboton = (Button)  findViewById(R.id.miboton);




    }


    public void accion(View view){
        TextInputLayout hlmitextInput =  (TextInputLayout) findViewById(R.id.inputpassword);

       String dato = hlmitextInput.getEditText().getText().toString();
       hlmitextInput.setHintAnimationEnabled(false);



        if (dato.length() < 4) { hlmitextInput.setError("Use un password mas largo");

        }
        else {hlmitextInput.setError(null);}


    }



}
