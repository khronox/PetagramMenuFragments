package com.duquehenry.petagrammenufragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import com.duquehenry.petagrammenufragments.adapter.AdaptadorMascota;
import com.duquehenry.petagrammenufragments.pojo.Mascota;
import java.util.ArrayList;

/**
 * Created by hduque on 25/07/2016.
 */
public class ActividadRating extends AppCompatActivity{

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotasRating;
    private Toolbar miActionBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_rating);

        //Mi Action Bar

        miActionBar = (Toolbar) findViewById(R.id.toolbar);
        miActionBar.setTitle(" ");
        if (miActionBar != null) {
            setSupportActionBar(miActionBar);
            //para que funcione la configuracion que se realizo en android.manifest
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }

        //RecyclerView
        listaMascotasRating = (RecyclerView) findViewById(R.id.recyclerViewMascotasRaiting);

        //Como mostrar el RecyclerView en una lista
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        //El RecyclerView se comportara como un LinearLayoutManager
        listaMascotasRating.setLayoutManager(linearLayoutManager);

        //Se llama al metodo inicializarListaMascotas
        inicializarListaDeMascotasRaiting();

        //Se llama al metodo inicializarAdapter
        inicializarAdapter();
    }

    //Metodo para llenado de mascotas

    public void inicializarListaDeMascotasRaiting(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Rocky",       "4.5",  R.drawable.mascota_5));
        mascotas.add(new Mascota("Kid",         "4.4",  R.drawable.mascota_9));
        mascotas.add(new Mascota("Ares",        "4.2",  R.drawable.mascota_8));
        mascotas.add(new Mascota("Aaron",       "4",    R.drawable.mascota_2));
        mascotas.add(new Mascota("Tito",        "3.9",  R.drawable.mascota_7));
    }

    //Metodo para inicializar el adaptador

    public void inicializarAdapter(){
        AdaptadorMascota adaptadorMascota = new AdaptadorMascota(mascotas, this);
        //El RecyclerView contendra al adaptador
        listaMascotasRating.setAdapter(adaptadorMascota);
    }

    //Creacion del menu de opciones
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
        //Se reemplaza el return por getMenuInflater()
        //return super.onCreateOptionsMenu(menu);
    }

    //Agregar los items del menu de opciones y que vaya a su correspondiente activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuOpciones_contacto:
                Intent intentContacto = new Intent(this, ActividadContacto.class);
                startActivity(intentContacto);
                break;
            case R.id.menuOpciones_acerca_de:
                Intent intentAcercaDe = new Intent(this, ActividadAcercaDe.class);
                startActivity(intentAcercaDe);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(ActividadRating.this, ActividadPrincipal.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}
