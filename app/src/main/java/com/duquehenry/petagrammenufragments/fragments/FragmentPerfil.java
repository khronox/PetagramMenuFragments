package com.duquehenry.petagrammenufragments.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.duquehenry.petagrammenufragments.R;

/**
 * Created by hduque on 01/08/2016.
 */
public class FragmentPerfil extends Fragment{

    public FragmentPerfil() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil_mascota, container, false);
    }
}
