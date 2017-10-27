package com.example.ma.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView hlmitexto = (TextView)  findViewById(R.id.MainActivity_txt_prueba);



        new CountDownTimer(5000, 500) {

            public void onTick(long millisUntilFinished) {
                hlmitexto.setText("seconds remaining: " + millisUntilFinished /500);
            }
            public void onFinish() {
           hlmitexto.setText("Fin!");
            }
        }.start();





    }
}
