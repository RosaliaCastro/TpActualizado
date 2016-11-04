package com.example.rosalia.primerparcialtp.Categoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.rosalia.primerparcialtp.R;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1){
            Log.d("Menu","Opcion1");
            finishAffinity();
            return true;
        }
        else
        if (id == R.id.opcion2){
            Log.d("Menu","Opcion2");
            return true;
        }
        else
        if (id == R.id.opcion3){
            Log.d("Menu","Opcion3");
            Intent intent3 = new Intent(this,ListaDeCategorias.class);
            startActivity(intent3);
            return true;
        }
        else
        if (id == R.id.opcion4){
            Log.d("Menu","Opcion4");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);


        ModeloCategoria modeloCategoria= new ModeloCategoria();
        ControladorCategoria controladorCategoria = new ControladorCategoria(modeloCategoria);
        VistaCategoria vistaCategoria = new VistaCategoria(modeloCategoria, this, controladorCategoria);

        //Intent intent = getIntent();
        //Bundle extras = intent.getExtras();
        //String mydato1= extras.getString("dato1");
        //String mydato2= extras.getString("dato2");
        //TextView nomDescripcion = (TextView)this.findViewById(R.id.textNomCategoria);
        //TextView descripcion = (TextView)this.findViewById(R.id.textDesCategoria);



    }
}
