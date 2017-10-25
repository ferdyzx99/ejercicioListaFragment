package com.example.ma.interfacesdeusuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ma on 25/10/17.
 *
 */

public class ListaAdapter extends BaseAdapter {

    private List<VersionSistemaOperativo> listasistemas;


    //constructor
    public ListaAdapter(List<VersionSistemaOperativo> listasistemas) {this.listasistemas = listasistemas;}




    @Override
    public int getCount() {return listasistemas.size();}

    @Override
    public VersionSistemaOperativo getItem(int i) {return listasistemas.get(i);}

    @Override
    public long getItemId(int i) {return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //pido el inflador

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View celda = inflater.inflate(R.layout.celdalistview,viewGroup,false);


        //ya termine de inflar la celda, ahora tengo que ponerle los datos que quiero

        //busco el dato a mostrar

        VersionSistemaOperativo datoAmostrar = this.getItem(i);

        //configurar la celda en funcion del nueva daot
        ImageView hlimageView  = (ImageView) celda.findViewById(R.id.celdalistview_imagen);
        TextView hltextoArriba = (TextView) celda.findViewById(R.id.celdalistview_textoArriba);
        TextView hltextoAbajo  = (TextView)  celda.findViewById(R.id.celdalistview_textoAbajo);

        //tengo los handles , ahora seteo los graficos con los datos
        hlimageView.setImageResource(datoAmostrar.getFotoDescriptiva());
        hltextoArriba.setText(datoAmostrar.getNombreVersion());
        hltextoAbajo.setText(datoAmostrar.getNumeroVersion());



        return celda;





    }
}
