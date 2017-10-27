package com.example.andres.fragmentmaslistview;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentListView.NotificableDeFragmentListView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentListView fragmentListView = new FragmentListView();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.contenedorFragment, fragmentListView);
        transaction.commit();

        // RESUMIDO
        //getSupportFragmentManager().beginTransaction()
        // .replace(R.id.contenedorFragment, fragmentListView)
        // .commit();
    }

    @Override
    public void recibirCancionClickeada(CancionRH cancionClickeada) {

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(FragmentDetalle.CANCION, cancionClickeada);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
