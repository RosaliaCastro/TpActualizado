package com.example.rosalia.primerparcialtp.Principal;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;


import com.example.rosalia.primerparcialtp.Categoria.Categoria;
import com.example.rosalia.primerparcialtp.Categoria.ListaDeCategorias;
import com.example.rosalia.primerparcialtp.MiDialogo;
import com.example.rosalia.primerparcialtp.R;
import com.example.rosalia.primerparcialtp.Registrar.pantallaRegistrar;

/**
 * Created by Jona on 28/09/2016.
 */
public class ControladorPrincipal implements View.OnClickListener {
    private ModeloPrincipal miModelo;
    private VistaPrincpal miVista;
    private Activity miActivity;
    String usuario;
    String contraseña;
    private HiloPrincipal myHilo;

    public ControladorPrincipal(ModeloPrincipal modelo, Activity actividad, HiloPrincipal hiloPrincipal){
        miModelo= modelo;
        miActivity= actividad;
        myHilo=hiloPrincipal;
    }

    public void ValidarUsuario(String miUsuario, String miClave){

        String mail = miUsuario;
        String password = miClave;
        Uri.Builder parametro = new Uri.Builder();
        parametro.appendQueryParameter("email", mail);
        parametro.appendQueryParameter("apiKey", password);
        myHilo = new HiloPrincipal(parametro);
        myHilo.start();
    }
    private void startActivity(Intent intent){
        miActivity.startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnRegistrarse) {
            Intent intent = new Intent(miActivity, pantallaRegistrar.class);
            startActivity(intent);

        } else {
            if (view.getId() == R.id.btnIngresar) {
                //obtengo usuario y contraseña. Luego valido que exista.
                contraseña = miVista.traerClave();
                usuario = miVista.traerUsuario();
                ValidarUsuario(usuario, contraseña);

            }
        }
    }
}
