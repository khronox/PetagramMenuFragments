package com.duquehenry.petagrammenufragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActividadContacto extends AppCompatActivity  implements View.OnClickListener {

    private Toolbar miActionBar;
    private EditText editTextEmail;
    private EditText editTextNombreContacto;
    private EditText editTextMensaje;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_contacto);

        //Mi Action Bar

        miActionBar = (Toolbar) findViewById(R.id.toolbar);
        miActionBar.setTitle(" ");
        if (miActionBar != null) {
            setSupportActionBar(miActionBar);
            //para que funcione la configuracion que se realizo en android.manifest
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextNombreContacto = (EditText) findViewById(R.id.editTextNombre);
        editTextMensaje = (EditText) findViewById(R.id.editTextDescripcionContacto);

        buttonEnviar = (Button) findViewById(R.id.buttomEnviar);
        buttonEnviar.setOnClickListener(this);
    }

    private void enviarCorreo() {
        String email = editTextEmail.getText().toString().trim();
        String nombre = editTextNombreContacto.getText().toString().trim();
        String mensaje = editTextMensaje.getText().toString().trim();

        EnviarCorreo enviarCorreo = new EnviarCorreo(this, email, nombre, mensaje);

        enviarCorreo.execute();
    }

    @Override
    public void onClick(View v) {
        enviarCorreo();
    }
}
