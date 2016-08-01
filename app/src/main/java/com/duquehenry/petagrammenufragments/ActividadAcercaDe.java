package com.duquehenry.petagrammenufragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ActividadAcercaDe extends AppCompatActivity {

    private Toolbar miActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_acerca_de);

        //Mi Action Bar

        miActionBar = (Toolbar) findViewById(R.id.toolbar);
        miActionBar.setTitle(" ");
        if (miActionBar != null) {
            setSupportActionBar(miActionBar);
            //para que funcione la configuracion que se realizo en android.manifest
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }

    }
}
