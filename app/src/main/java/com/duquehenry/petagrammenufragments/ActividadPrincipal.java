package com.duquehenry.petagrammenufragments;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.duquehenry.petagrammenufragments.adapter.AdaptadorPage;
import com.duquehenry.petagrammenufragments.fragments.FragmentPerfil;
import com.duquehenry.petagrammenufragments.fragments.FragmentRecyclerView;
import java.util.ArrayList;

public class ActividadPrincipal extends AppCompatActivity{

    private Toolbar miActionBar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        miActionBar = (Toolbar) findViewById(R.id.toolbar);
        miActionBar.setTitle(" ");
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        if (miActionBar != null) {
            setSupportActionBar(miActionBar);
        }
    }

    //Metodo para add los fragments a un arreglo de fragments
    private ArrayList<Fragment> addFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new FragmentRecyclerView());
        fragments.add(new FragmentPerfil());
        return fragments;
    }

    //Metodo para poner en orbita los fragments
    private void setUpViewPager() {
        viewPager.setAdapter(new AdaptadorPage(getSupportFragmentManager(), addFragments()) {
        });
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_dog);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_home);
    }

    //Para ir a la activity de Raiting
    public void irRatingMascotas(View view){
        Intent intent = new Intent(this, ActividadRating.class);
        startActivity(intent);
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
}
