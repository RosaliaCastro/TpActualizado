package com.example.rosalia.primerparcialtp.Categoria;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rosalia.primerparcialtp.R;

/**
 * Created by Jona on 28/09/2016.
 */
public class VistaCategoria {

    private ModeloCategoria modeloCategoria;
    private EditText nombreCategoria;
    private EditText descricionCategoria;
    private Button crear;

    public VistaCategoria(ModeloCategoria mod, Activity activity, ControladorCategoria contCategoria){



        modeloCategoria = mod;
        //nombreCategoria= (EditText)activity.findViewById(R.id);
        //descricionCategoria=(EditText)activity.findViewById(R.id.editTextDescripcion);
        crear = (Button)activity.findViewById(R.id.btnCrear);
        crear.setOnClickListener(contCategoria);
    }


}
