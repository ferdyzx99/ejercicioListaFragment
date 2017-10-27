package com.example.andres.fragmentmaslistview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_list_view, container, false);

        //ENCONTRAR EL LISTVIEW
        ListView listView = (ListView) view.findViewById(R.id.listView);

        //CREAR UNA LISTA
        List<CancionRH> canciones = new ArrayList<>();
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));
        canciones.add(new CancionRH("Californication",1000000000, R.drawable.californication));


        CancionAdapter adapter = new CancionAdapter(canciones);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                CancionRH cancionAEnviar = (CancionRH) adapterView.getItemAtPosition(i);
                NotificableDeFragmentListView notificable = (NotificableDeFragmentListView) getContext();
                notificable.recibirCancionClickeada(cancionAEnviar);
            }
        });


        return view;
    }

    public interface NotificableDeFragmentListView{

        public void recibirCancionClickeada(CancionRH cancionClickeada);

    }
}
