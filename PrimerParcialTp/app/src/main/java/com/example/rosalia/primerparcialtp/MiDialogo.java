package com.example.rosalia.primerparcialtp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by Jona on 28/09/2016.
 */
public class MiDialogo extends DialogFragment {



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Atencion!!!");
        builder.setMessage("Ha ingresado datos incorrectos, o aun no se a registrado");

        ListenerAlert uno = new ListenerAlert();
        builder.setPositiveButton("Aceptar", uno);

        AlertDialog crear = builder.create();
        return crear;
    }
}
