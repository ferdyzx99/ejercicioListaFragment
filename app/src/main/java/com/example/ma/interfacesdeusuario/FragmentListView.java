package com.example.ma.interfacesdeusuario;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListView extends Fragment {


    public FragmentListView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vistaFragment =  inflater.inflate(R.layout.fragment_fragment_list_view, container, false);

        //creo los datos


        List<VersionSistemaOperativo> listasistemas = new ArrayList<>();
        listasistemas.add(new VersionSistemaOperativo("Donut","Android 1.6",R.drawable.donut));
        listasistemas.add(new VersionSistemaOperativo("Eclair","Android 2.0",R.drawable.eclair));
        listasistemas.add(new VersionSistemaOperativo("Froyo","Android 2.2",R.drawable.froyo));
        listasistemas.add(new VersionSistemaOperativo("Gingerbread","Android 2.3",R.drawable.gingerbread));
        listasistemas.add(new VersionSistemaOperativo("Honeycom","Android 3.0",R.drawable.honeycomb));
        listasistemas.add(new VersionSistemaOperativo("Icecream","Android 4.0",R.drawable.icecream));
        listasistemas.add(new VersionSistemaOperativo("Jellybean","Android 4.3",R.drawable.jellybean));
        listasistemas.add(new VersionSistemaOperativo("KitKat","Android 3.0",R.drawable.kitkat));
        listasistemas.add(new VersionSistemaOperativo("Lollipop","Android 5.0",R.drawable.lollipop));
        listasistemas.add(new VersionSistemaOperativo("KitKat","Android 6.0",R.drawable.marshmallow));
        listasistemas.add(new VersionSistemaOperativo("Nougat","Android 7.0",R.drawable.nougat));
        listasistemas.add(new VersionSistemaOperativo("Oreo","Android 8.0",R.drawable.oreo));




    ///ahora pido el adapter, al cual le tengo que mandar los datos

        ListaAdapter adapterDeLaListaDeVersionesAndroid = new ListaAdapter(listasistemas);

    ///Ahora enlazo el adapter con la lista
        ListView HLlistadeversionesAndroid = vistaFragment.findViewById(R.id.fragmenListView_listadeVersionesAndroid);
        HLlistadeversionesAndroid.setAdapter(adapterDeLaListaDeVersionesAndroid);



    return vistaFragment;

    }

}
