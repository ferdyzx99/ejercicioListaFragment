package com.example.andres.fragmentmaslistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by andres on 10/25/17.
 */

public class CancionAdapter extends BaseAdapter{

    private List<CancionRH> listCanciones;

    public CancionAdapter(List<CancionRH> listCanciones) {
        this.listCanciones = listCanciones;
    }

    @Override
    public int getCount() {
        return listCanciones.size();
    }

    @Override
    public CancionRH getItem(int i) {
        return listCanciones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        View celda = layoutInflater.inflate(R.layout.listview_detalle_celda, viewGroup, false);

        //DATO A MOSTRAR
        CancionRH cancionRHAMostrar = getItem(i);

        //CARGAR EL DATO EN LA CELDA
        ImageView imageView = (ImageView) celda.findViewById(R.id.celdaImageView);
        TextView textViewTitulo = (TextView) celda.findViewById(R.id.celdaTextViewTitulo);
        TextView textViewDuracion = (TextView) celda.findViewById(R.id.celdaTextViewDuracion);

        imageView.setImageResource(cancionRHAMostrar.getFotoAlbum());
        textViewDuracion.setText(cancionRHAMostrar.getDuracion().toString());
        textViewTitulo.setText(cancionRHAMostrar.getTitulo());

        return celda;
    }
}
