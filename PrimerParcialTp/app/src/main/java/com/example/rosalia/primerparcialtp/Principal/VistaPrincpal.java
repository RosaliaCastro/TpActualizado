package com.example.rosalia.primerparcialtp.Principal;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.example.rosalia.primerparcialtp.R;

/**
 * Created by Jona on 28/09/2016.
 */
public class VistaPrincpal {
    private ModeloPrincipal miModeloP;
    private Button registrarse;
    private Button ingresar;
    private EditText usuario;
    private EditText clave;

    public VistaPrincpal(ModeloPrincipal modeloPrincipal, Activity activity, ControladorPrincipal controladorPrincipal) {

        miModeloP = modeloPrincipal;

        registrarse = (Button) activity.findViewById(R.id.btnRegistrarse);
        ingresar = (Button) activity.findViewById(R.id.btnIngresar);
        usuario = (EditText) activity.findViewById(R.id.editTextUsuario);
        clave = (EditText) activity.findViewById(R.id.editTextClave);

        registrarse.setOnClickListener(controladorPrincipal);
        ingresar.setOnClickListener(controladorPrincipal);
    }

    public String traerUsuario() {
        String miUsuario = usuario.getText().toString();
        return miUsuario;
    }

    public String traerClave() {
        String miClave = clave.getText().toString();
        return miClave;
    }


}

