package com.duquehenry.petagrammenufragments.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.duquehenry.petagrammenufragments.ActividadPrincipal;
import com.duquehenry.petagrammenufragments.ActividadRating;
import com.duquehenry.petagrammenufragments.adapter.AdaptadorMascota;
import com.duquehenry.petagrammenufragments.pojo.Mascota;
import com.duquehenry.petagrammenufragments.R;
import java.util.ArrayList;

/**
 * Created by hduque on 30/07/2016.
 */
public class FragmentRecyclerView extends Fragment{
    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        //RecyclerView
        listaMascotas = (RecyclerView) view.findViewById(R.id.idRecyclerView_mascotas);

        //Como mostrar el RecyclerView en una lista
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        //El RecyclerView se comportara como un LinearLayoutManager
        listaMascotas.setLayoutManager(linearLayoutManager);

        //Se llama al metodo inicializarListaContactos
        inicializarListaDeMascotas();

        //Se llama al metodo inicializarAdapter
        inicializarAdapter();


        return view;
    }

    //Metodo para llenado de contactos

    public void inicializarListaDeMascotas() {

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Khronox",     "3",    R.drawable.mascota_1));
        mascotas.add(new Mascota("Aaron",       "4",    R.drawable.mascota_2));
        mascotas.add(new Mascota("Hades",       "3.5",  R.drawable.mascota_3));
        mascotas.add(new Mascota("Cookie",      "3.7",  R.drawable.mascota_4));
        mascotas.add(new Mascota("Rocky",       "4.5",  R.drawable.mascota_5));
        mascotas.add(new Mascota("Amanda",      "3.1",  R.drawable.mascota_6));
        mascotas.add(new Mascota("Tito",        "3.9",  R.drawable.mascota_7));
        mascotas.add(new Mascota("Ares",        "4.2",  R.drawable.mascota_8));
        mascotas.add(new Mascota("Kid",         "4.4",  R.drawable.mascota_9));
        mascotas.add(new Mascota("Susie",       "3.6",  R.drawable.mascota_10));

    }

    //Metodo para inicializar el adaptador

    public void inicializarAdapter(){
        AdaptadorMascota adaptadorMascota = new AdaptadorMascota(mascotas, getActivity());
        //El RecyclerView contendra al adaptador
        listaMascotas.setAdapter(adaptadorMascota);
    }
}
