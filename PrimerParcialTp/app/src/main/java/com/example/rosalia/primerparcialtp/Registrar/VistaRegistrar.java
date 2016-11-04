package com.example.rosalia.primerparcialtp.Registrar;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.example.rosalia.primerparcialtp.R;

/**
 * Created by Jona on 05/10/2016.
 */
public class VistaRegistrar {
    ModeloRegistrar miModelo;
    private EditText nombre;
    private EditText apellido;
    private EditText usuario;
    private EditText clave1;
    private EditText clave2;
    private Button registrarme;
    private Button cancelar;

    public VistaRegistrar(ModeloRegistrar mod, Activity activity, ControladorRegistrar controladorRegistrar){

        miModelo = mod;
        nombre=(EditText)activity.findViewById(R.id.editTextNombre);
        apellido=(EditText)activity.findViewById(R.id.editTextApellido);
        usuario=(EditText)activity.findViewById(R.id.editTextUsuarioR);
        clave1=(EditText)activity.findViewById(R.id.editTextClaveR1);
        clave2=(EditText)activity.findViewById(R.id.editTextClaveR2);
        registrarme=(Button)activity.findViewById(R.id.btnNuevo);
        cancelar=(Button)activity.findViewById(R.id.btnCancelar);

        registrarme.setOnClickListener(controladorRegistrar);
        cancelar.setOnClickListener(controladorRegistrar);


    }
    public String Nombre(){
        String miNombre;
        miNombre = nombre.getText().toString();
        return miNombre;
    }
    public String Apellido(){
        String miNombre;
        miNombre = apellido.getText().toString();
        return miNombre;
    }
    public String Usuario(){
        String miNombre;
        miNombre = usuario.getText().toString();
        return miNombre;
    }
    public String Clave1(){
        String miNombre;
        miNombre = clave1.getText().toString();
        return miNombre;
    }
    public String Clave2(){
        String miNombre;
        miNombre = clave2.getText().toString();
        return miNombre;
    }
}
