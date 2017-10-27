package com.example.andres.fragmentmaslistview;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment {

    public static final String CANCION = "cancion";

    public FragmentDetalle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detalle, container, false);

        Bundle bundle = getArguments();
        CancionRH cancionAMostrar = (CancionRH) bundle.getSerializable(CANCION);

        ImageView imageView = view.findViewById(R.id.imageViewDetalle);
        imageView.setImageResource(cancionAMostrar.getFotoAlbum());

        TextView textView = view.findViewById(R.id.textViewTitulo);
        textView.setText(cancionAMostrar.getTitulo());

        return view;
    }

}
