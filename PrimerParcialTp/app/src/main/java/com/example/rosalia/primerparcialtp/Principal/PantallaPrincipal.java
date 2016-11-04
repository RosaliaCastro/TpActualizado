package com.example.rosalia.primerparcialtp.Principal;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rosalia.primerparcialtp.Categoria.ListaDeCategorias;
import com.example.rosalia.primerparcialtp.MiDialogo;
import com.example.rosalia.primerparcialtp.R;

import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class PantallaPrincipal extends AppCompatActivity implements Handler.Callback {
    HiloPrincipal hiloPrincipal;
    public static final int MENSAJE_INGRESAR=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        Handler.Callback callback= this;
        Handler handler = new Handler(callback);
        hiloPrincipal = new HiloPrincipal(handler);


        ModeloPrincipal modeloPrincipal = new ModeloPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(modeloPrincipal,this,hiloPrincipal);
        VistaPrincpal vistaPrincpal = new VistaPrincpal(modeloPrincipal,this,controladorPrincipal);
        }

    @Override
    public boolean handleMessage(Message message) {
        MiDialogo miDialogo = new MiDialogo();
        if(message.arg1 == MENSAJE_INGRESAR){
            //leer el mensaje
            String json = (String)message.obj.toString();
            try{
                //obtengo el archivo json
                if (ModeloPrincipal.TraerUsuarioJS(json)== true ) {
                    Intent intent2 = new Intent(this, ListaDeCategorias.class);
                    startActivity(intent2);
                    //si me retorna true, es porque el usuario existe. Luego lo paso de pantalla.

                }else {
                    miDialogo.show(getFragmentManager(), "dialogo");
                }
            }catch (IOException e){
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }
}
