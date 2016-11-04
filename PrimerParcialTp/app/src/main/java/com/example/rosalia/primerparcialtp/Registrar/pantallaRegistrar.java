package com.example.rosalia.primerparcialtp.Registrar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.rosalia.primerparcialtp.Categoria.Categoria;
import com.example.rosalia.primerparcialtp.Categoria.ListaDeCategorias;
import com.example.rosalia.primerparcialtp.R;

public class pantallaRegistrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar);
        ModeloRegistrar modeloRegistrar = new  ModeloRegistrar();
        ControladorRegistrar controladorRegistrar= new ControladorRegistrar(modeloRegistrar,this);
        VistaRegistrar vistaRegistrar = new VistaRegistrar(modeloRegistrar,  this, controladorRegistrar);
    }
}
